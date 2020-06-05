CREATE TABLE title_basics  ( 
   tconst VARCHAR(100) PRIMARY KEY NOT NULL,  
   titleType VARCHAR(100) NOT NULL, 
   primaryTitle VARCHAR(100) NOT NULL, 
   isAdult BOOLEAN(0),
   startYear SMALLINT NOT NULL,
   endYear SMALLINT NOT NULL,
   runtimeMinutes SMALLINT NOT NULL, 
   genres VARCHAR(255) NOT NULL
);

CREATE TABLE title_principals  ( 
   tconst VARCHAR(100) PRIMARY KEY NOT NULL,  
   ordering INTEGER(100) NOT NULL, 
   nconst VARCHAR(100) NOT NULL, 
   category VARCHAR(255) NOT NULL,
   job VARCHAR(255) NOT NULL,
   characters VARCHAR(255) NOT NULL
);

CREATE TABLE name_basics  ( 
   nconst VARCHAR(100) PRIMARY KEY NOT NULL,  
   primaryName VARCHAR(100) NOT NULL, 
   birthYear SMALLINT NOT NULL,
   deathYear SMALLINT NOT NULL,
   primaryProfession VARCHAR(255) NOT NULL, 
   knownForTitles ARRAY
);