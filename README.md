# ClientService2

This service acts as DiscoveryClient2 that interacts with client1 using FeignClient & Eureka service registry and also getting properties from cloud config through client1.
This service access User Data in DB with CRUD Repository DAO 

Spring.application.name: test-client2
server.port: 8072-localhost
profile: default

 "/test/returnString" --Returns String from client1 fetches cloud property
    
 "/test/propList" --Method returns Prop from Cloud Config server as a List
