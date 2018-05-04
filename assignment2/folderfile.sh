#!/bin/bash
echo "please enter folder name"

read folder

echo "please enter the number of text files creating" 
read number
len=${#folder}
mkdir $folder
cd $folder
for ((i=1; i<=$number; i++))
do
    touch $folder$i
done

zip -r $folder.zip * 

for (( i=$len-1; i>=0; i-- ))
do 
	revfolder="$revfolder${folder:$i:1}"
done
 
mkdir $revfolder

unzip $folder.zip -d $revfolder/$folder

for ((i=1; i<=$number; i++))
do
    cp  $folder$i $revfolder 
done
 
cd $revfolder

 rm -r $folder/*







