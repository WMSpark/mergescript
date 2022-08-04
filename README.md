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

# pages
> In this property we are specifying the names of pages/partials (newly created or) that we want to persist from the implementation project
> Example: Main, DashBoard, partialAccounts

# services
> Here we will be adding all the names of services that we want to persist from implementation project
> Example: testJavaService,randomUser, test_db, securityService

# prefabs
> This property we are using to merge prefabs that we want to persist from the implementation project src/main/webapp/WEB-INF/prefabs/.
> Example: QRCOde, Googlemaps

# icons
> In this property we will be specifying the icon names from the implementation project src/main/webapp/WEB-INF/prefabs/ that we want to merge.

# themes
> Specify the themes names from implementation project src/main/webapp/themes to merge.
> Example: dark

# appVariables=true
> Enable this flag (true) to merge implementation project src/main/webapp/app.variables.json.
 
# languages
> In the specify all Locale file names that you want to merge.
>  Example: en.json, hi.json

# appjs=false

# appjslineno=285

# profiles
> Add the property files here to persist implementation props.
>  Example: development.properties,deployment.properties

# projectUserSpringXml
> Enable this flag (true) to merge implementation project src/main/webapp/WEB-INF/project-user-spring.xml.

# resources
> In this property add the folders/subfolders from the resources that we want to persist from the implementation project.
>   Example:images, icons, files

# copyWmprojectProperties
> Enable this flag (true) to persist .wmproject.properties of  implementation project.

# copyi18n
> Enable this flag (true) to persist i18n from the implementation Project.

# copyDependencyJson
> Enable this flag (true) to merge Dependency.Json with implementation project.

# copyWmFormattersJs
> Enable this flag (true) to copy Formatters.js from implementation Project.

# javaFiles
> Specify the filter names here to persist the filters from implementation project.
> Note: specify the path in readandcopyjavafiles target from build.xml (Ex: src/main/java/com/finacle/obmb/framework).