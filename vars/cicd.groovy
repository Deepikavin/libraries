def gitdownload(repo)
{
  git "https://github.com/Deepikavin/${repo}.git"
}
def mavenbuild()
{
  sh "mvn package"
}
def tomcatDeploy(jobname,ip,contextpath)
{
  sh "scp /var/libs/jenkins/workspace/${jobname} ${ip}/webapss/${contextpath}.war"
}
def runSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
