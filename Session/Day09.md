# Setup Docker

- http://localhost/tutorial/
- https://docs.docker.com/get-started/

docker run -p 80:80 --rm docker/getting-started
// the following is better to test if docker is running
docker run --rm hello-world


# Steps 

- Setup Docker
- Install Ubuntu 20.04 from Windows Store
- Install the docker extension by Microsoft for VSCode
- Create Docker IDs and login to Docker for Desktop using them.

## Setting up wsl and virtual machine

1. open start menu
2. Search for Add or Remove Programs
3. On the right side -> Program and Features
4. On the left side -> Turn Windows Features on or off
5. Enable Windows Subsystem for Linux and Virtual Machine Platform

## Setting up Ubuntu as defaul wsl distro

- Download Ubuntu from Microsoft store
- Launch Ubuntu using Microsoft store or from Start menu
- Wait for it to finish installation
- Create a user!!!!

## IF you forget to create a user then

```
adduser testuser

usermod -aG docker testuser
```

In powershell

ubuntu2004 config --default-user testuser

## Next

- Run the following in powershell (not as administrator)


```
wsl --set-default-version 2
wsl --list
wsl -s Ubuntu-20.04
wsl --list
wsl --set-version Ubuntu-20.04 2
```

Ubuntu should have a Default message next to it

# Cloning the dockerfiles from Oracle

1. Create a new folder in the root of any drive. Avoid C:/ if possible
2. Go Inside that directory
3. Open Powershell inside that directory
4. Run `git clone https://github.com/oracle/docker-images` in the powershell window

# Read Instructions present on the github url(do not try to clone)

1. https://github.com/oracle/docker-images
2. https://github.com/oracle/docker-images/tree/main/OracleDatabase/SingleInstance

# Enabling Docker inside Ubuntu WSL

- Open the Docker Dashboard
- Open Settings
- Go to Resources-> WSL Integration
- Enable `Enable integration with my default WSL distro`
- Enable `Ubuntu-20.04`

# Installing Oracle 19c on a docker container

1. To make things easy open a new window in VSCode
2. Open the folder `docker-images/OracleDatabase/SingleInstance` inside the directory that you get after cloning
3. Copy the `LINUX.X64_193000_db_home.zip` file that you download from the oracle website inside the `19.3.0` folder inside this directory(dockerfiles).
4. Open VSCode terminal and enter the command `wsl`
5. Inside the Ubuntu shell type `cd dockerfiles` to get inside that directory
6. Run the following command

```
./buildContainerImage.sh -v 19.3.0 -e
```


# Stages of being stuck

1. Stuck at wsl
2. Stuck at Docker
3. Stuck at getting ubuntu to work
4. Stuck at cloning and other things

# Creating a container

To check if build was successful:

```
docker image ls
```

should see `oracle/database          19.3.0-ee    6.53GB`


Inside wsl
```
cd ~
mkdir oracledata
sudo chown -R 54321:54321 ~/oracledata
```

- inside wsl

```
docker run --name odb \
    -p 1521:1521 -p 5500:5500 \
    -e ORACLE_SID=ORCLCDB \
    -e ORACLE_PDB=ORCLPDB \
    -e ORACLE_PWD=strong7Password \
    -e ORACLE_EDITION=enterprise \
    -v ~/oracledata/:/opt/oracle/oradata \
    oracle/database:19.3.0-ee
```


To commit the finished container to an image type the following(this can be powershell or wsl. It doesn't matter). This is primarily to help me help you

```
docker commit odb odbimage
docker image ls
```

Last command to verify