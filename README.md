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



# How changes.properties will work

#### pages
> Usage- Specify the names of pages/partials that you want to retain from the implementation project.

>   Example: pages=Main,DashBoard,partialAccounts

#### services
> Usage- Specify the names of service(folder) that you want to retain from implementation project

>   Example: services=testJavaService,randomUser,test_db,securityService

#### prefabs
> Usage- Specify all the Prefab names you want to reatin from implementation project

>   Example: prefabs=QRCOde, Googlemaps

#### icons
> Usage- Specify all the icon names in src/main/webapp/ that you want to reatin from implementation project

>   Example: icons=favicon.png, userImg.png

#### themes
> Usage- Specify all the icon names in src/main/webapp/themes that you want to reatin from implementation project

>   Example: themes=dark

#### appVariables
>  Usage- Enable this flag to merge the file of both the projects(src/main/webapp/app.variables.json)

>   Example: appVariables=true

#### languages
>  Usage-  Specify all the i18n file names that you want to merge from implementation project

>   Example: languages=en.json, hi.json

#### appjs
>  Usage- Enable this flag to concat implementation app.js changes

>   Example: appjs=true

#### appjslineno
>  Usage- Specify the line number from appjs(from implementation), from where you want to concat 

>   Example: appjslineno=285

#### profiles
>  Usage- Specify all the properties file names that you want to reatin from implementation project

>  Example: profiles=development.properties,deployment.properties

#### projectUserSpringXml
>  Usage- Enable this flag to merge the file of both the projects(src/main/webapp/WEB-INF/project-user-spring.xml)

>   Example: projectUserSpringXml=true

#### wmprojectProperties
>  Usage- Enable this flag to reatin the file(.wmproject.properties) from implementation project

>   Example:copyWmprojectProperties= true

#### i18n
>  Usage- Enable this flag to retain i18n files specific to implementation project

>   Example:copyi18n= true

#### dependencyJson
>  Usage- Enable this flag to merge dependency.json from both the projects

>   Example:copyDependencyJson= true


#### wmFormattersJs
>  Usage- Enable this flag to retain Formatters.js specific to implementation project

>   Example:copyWmFormattersJs= rue

#### folders
> Usage- Specify all the folder names(src/main/webapp/resources) along with the path that you want to merge from both the projects

>   Example:folders = src/main/webapp/sbResources,src/main/webapp/resources/icons,src/main/webapp/resources/images

#### files
> Usage- Specify all the files along with the paths in which you wanted to retain from implementation project

>   Example:files= src/main/webapp/resources/newFileNameFromDerivedProject.js

## Collaborators

| SR No | Name                                                                                                                                | designation                                                  |
| ----- | -------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------- |
| 1     | [ Annapurna Kotte](https://github.com/Annapurna-Kotte)|
| 2     | [  Venkateswarlu Kakani](https://github.com/wm-venkateshkakani)|
| 3     | [ Karthik Peerlagudem](https://github.com/krthk-peerlagudem)|
| 4     | [ Sagar Vemala](https://github.com/wm-sagarvemala)|