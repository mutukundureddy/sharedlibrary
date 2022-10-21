def newgit (repo)
{
  git"${repo}" 
}

def newmaven()
{
  sh'mvn package'
}
def newdeploy(jobname,ip,context)
{
  sh'/home/ubuntu/.jenkins/workspace/declarative pipeline with shared libraray/webapp/target/webapp.war ubuntu@172.31.3.89:/var/lib/tomcat9/webapps/testap.war'
}
