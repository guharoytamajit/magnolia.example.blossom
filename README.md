# magnolia.example.blossom

This is a Magnolia CMS example project which uses blossom for Spring Framework integration.

## General

For additional information please have a look at:

* https://documentation.magnolia-cms.com/display/DOCS/Magnolia+5.4+documentation
* https://documentation.magnolia-cms.com/display/DOCS/Blossom+module
* https://documentation.magnolia-cms.com/display/DOCS/Getting+started+with+Blossom

## System Setup

* Java 8
* Maven 3
* Tomcat 8
* IDE, which can handle Maven projects like IntelliJ IDEA, Netbeans or Eclipse

## Project Setup

### 1. Step: Magnolia Project Module Setup

In a directory of choice i.e. "~/projects/":

mvn archetype:generate -DarchetypeCatalog=https://nexus.magnolia-cms.com/content/groups/public/

* archetype = 5 = magnolia-project-archetype
* archetype version = 4 = 1.2.2
* groupId = org.dynamosoft.projects
* artifactId = magnolia.example.blossom
* version = 1.0-SNAPSHOT
* package = org.dynamosoft.projects
* magnolia-version = 5.4.3
* project-name = magnolia.example.blossom
* Y = to procced


* cd magnolia.example.blossom
* mvn install

### 2. Step: Magnolia Blossom Module Setup

In the parent project directory "~/projects/magnolia.example.blossom/":

mvn archetype:generate -DarchetypeCatalog=https://nexus.magnolia-cms.com/content/groups/public/

* archetype = 3 = magnolia-blossom-module-archetype
* archetype version = 4 = 1.2.2
* groupId = org.dynamosoft.projects
* artifactId = magnolia.example.blossom-blossom
* version = 1.0-SNAPSHOT
* package = org.dynamosoft.projects
* blossom-version = 3.1.2
* magnolia-version = 5.4.3
* project-name = magnolia.example.blossom-blossom
* Y = to procced