# Merge Script

Merge Script used to merge the core project and implementation project and prepared the result as seperate folder.

## Prerequisites
- Ant 
- Java (1.8 or above)

## How it works
The Merge Script takes the two folders(one is core folder and one is implementation folder) and one text file(changes.properties) as input and process the script according the changes mentioned in the text file.

#### Run-time rquirements
- Two Input folders(core and implementation folders).
- changes.properties file(The changes.properties file used to maintain the changes which are made in implementation folder. And basically we maintain this file in implementation folder).
- comparisation.jar(java jar file to compare the properties file).
- build.xml(Ant build script file).


## How to run

#### Step 1: Keep all the requirements at one place
> create the folder and inside folder copy the below files.
- build.xml
- core project folder
- implementation folder(make sure the changes.properties were present with needed chnages).
- comparision jar file( dist/jar -->create sub directory dist and inside the folder paste it).

#### Step 2: Run the Ant command
> Navigate to the created folder and run the below command in terminal
``` bash
$ ant copyimplresourcestocore -Dcorerepo="sourceFolder" -Dcustomrepo="implementation" -Dissecurity="false" -DisImplkeysadd="true"
```
> Above command has the four inputs
- -Dcorerepo -->source folder
- -Dcustomrepo -->implementation folder
- -Dissecurity -->true if the implementation has followed different security mechanism otherwise false
-DisImplkeysadd --> true if the implementation added any key and those are required further in profiles(properties files) otherwise false.

#### Step 3: Check the results
> The results folder will be created on the same folder the source folder exist and the name of the folder be like sourceFolder_bk.
> navigate to sourceFolder_bk and inside the folder will find the zip file for the results.
> we can use this file to reimport to Wavemaker.
