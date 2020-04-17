# com.openHouse.BackendAPIs

Developed this project to display my full knowdlege of API development in spring boot. Batch files pocessing experience that reads data log files from users at every five minutes.  These files are processed in batches of 100 chunks. The log data read from these files are stored  on MongoDB. This project is also well tested.

## Development server

This project was developed in spring boot enviroment. To be able to run it, a spring boot enviroment must first be setup. Please review online materials on how to setup spring boot environment and import spring boot project into the environment.


## Build Code Structure
```bash
| -- src
  |
  | -- batch 
  |
    | -- CustomItemReader
    |
    | -- DataLogDetailsProcessor
    |
    | -- MongoCustomWriter
    |
  |
  | -- com.openHouse.BackendAPIs
  |
    |
    | -- Application
    |
    | -- ServletInitializer
    |
  |
  | -- config
  |
    |
    | -- DataLogsFilesBacthProcessingConfig
    |
  |
  | -- controller
    |
    | -- DataLogController
    |
  |
  | -- dao
  |
    |-- DatabaseSequenceDAO
    |
    | -- DataLogDAO
    |
  |
  | -- daoImp
  |
    | -- DatabaseSequenceDAOImpl
    |
    | -- DataLogDAOlmpl
    |
  |
  | -- domain
  |
    |
    | -- Container
    |
  | -- dto
  |
    | -- DatabaseSequence
    |
    | -- DataLogDetails
    |
  |
  | -- repo
  |
    | -- DataLogRepo
    |
  |
  | -- service
    |
    | -- DataLogService
    |
  |
  | -- serice
  |
    |
    | -- DataLogServiceImpl
    |
|
|
| -- Test
|
  |
  | -- controllerTest
  |
    | -- DataLogControllerTest
  |
  | -- daoImpTest
  |
    | -- DataLogDAOImpTest
    |
  | -- domainTest
  |
    | -- ContainerTest
    |
  | -- dtoTest
    |
    | -- DataLogDetailsTest
    |
  | -- repoTest
  |
    | -- DataLogRepoTest
  |
  | --
  |
    | -- DataLogServiceImplTest
  |
|
    
     
  ```


      
## Further help

To get more help, please contact idowutimi@gmail.com

 


 
