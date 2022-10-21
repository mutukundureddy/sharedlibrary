def newgit (repo)
{
  git"${repo}" 
}

def newmaven()
{
  sh'mvn package'
}

def newdeploy (jobname,ip,context)
{
  sh "scp /home/ubuntu/.jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}/home/ubuntu/tomcat9/webapps/${context}.war"
}
 
def newselenium (jobname)
{
  sh "java -jar /home/ubuntu/.jenkins/workspace/${jobname}/testing.jar"
}
