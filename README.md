# How to setup (naver CentOS 기준)

개인 세팅할때 쓰던 명령어를 정리해놨다.

naver CentOS외의 환경 (GCP, mac 등..) 에서는 yum 대신 homebrew / apt-get 등의 패키지 관리자를 이용할 수도 있고, unzip같은 일부 명령어를 설치해야할 수도 있다.

- wget https://services.gradle.org/distributions/gradle-6.5-all.zip

- sudo mkdir /opt/gradle

- sudo unzip -d /opt/gradle gradle-6.5-all.zip

- yum install java-1.8.0-openjdk

- yum install java-1.8.0-openjdk-devel

- readlink -f /usr/bin/java

이곳에서 나오는 주소 복사 후 수정할때 참고

- sudo vim /etc/profile

---

```
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-1.8.0.292.b10-1.el7_9.x86_64 // readlink 명령어로 얻은 경로 참조
export CLASSPATH=$JAVA_HOME/jre/lib:$JAVA_HOME/lib/tools.jar
export GRADLE_HOME=/opt/gradle/gradle-6.5
export PATH=$PATH:$JAVA_HOME/bin:$GRADLE_HOME/bin
```

- (:wq!로종료)

---

- source /etc/profile

---

- git clone https://github.com/edicom000111/HV-Discord-bot.git

- cd HV-Discord-bot

- nohup gradle run --args='봇토큰' &

- fg $1

# 네이버 서버

ssh root@외부아이피 -p 포트