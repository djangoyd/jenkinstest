def buildApp(){
    echo 'build application'
}
def testApp(){

    echo 'testing application'
}
def deployApp(){
    echo 'deploying application'
    echo "deploying version ${params.version}"
}
return this