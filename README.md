Run with ActiveMQ Docker container **webcenter/activemq**

**Start container:**
docker run --name='activemq' -it --rm -P webcenter/activemq:latest

**Show ActiveMQ dashboard:**
http://localhost:32789/admin/queues.jsp

username: admin, password: admin