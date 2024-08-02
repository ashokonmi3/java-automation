D:\Study\javaselenium\grid


standalone grid used for degugging purpose 

java -jar selenium-server-4.15.0.jar standalone 
==========================
Run the hub and node

java -jar selenium-server-4.15.0.jar hub

java -jar selenium-server-4.15.0.jar node  --hub http://192.168.56.1:4444

==========================
Registering the node from other machine need IP of Hub
java -jar selenium-server-<version>.jar node --hub http://<hub-ip>:4444

java -jar selenium-server-4.15.0.jar node  --hub http://192.168.56.1:4444

===============================
java -jar selenium-server-4.15.0.jar node --port 5556
java -jar selenium-server-<version>.jar node --port 5555



Hub- 
Is controller where we start executing test case

selenium-server-4.15.0.jar 

java -jar selenium-server-4.15.0.jar hub


Goto Node machine 
selenium-server-4.15.0.jar 
java -jar selenium-server-<version>.jar node --hub http://<hub-ip>:4444
=================

Linux | Chrome | firefox |Edge 
Windows 11 | Chrome | Firefox | Edge
Windows 12 | Chrome | Firefox | Edge
Mac | Chrome| Forefox | Edge

Hub ----> Node 1 ( Linux , chrome)
                 Node 2( Windows 11 , firefox)
                 Node 3( Windows 12 Edge)
                 Node 4 (Mac( Chrome))
                 
             

