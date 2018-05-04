#!/bin/bash
MSG1="please enter folder name"
echo $MSG1

read folder

MSG2="please enter the number of text files creating"
echo $MSG2 
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
path="$PWD"
 rm -r $folder/*
#echo "$path"

cd /

sudo adduser devops

sudo chown -R devops:devops $path
sudo chmod -R 755 $path
cd "$path"
ls




