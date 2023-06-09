pipeline{
    agent any 
    parameters{
        choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'],description:'')
        booleanParam(name: 'executeTests',defaultValue: true,description: '')
    }
        stages{
            stage("Build"){
                steps{
                    echo "Here is build step"
                }
            }
            stage("Test"){
               when{
                    expression{
                        params.executeTests
                    }
                }
                steps{
                    echo "Here is test step"
                }
            }
            stage("Deployement"){
                steps{
                    echo 'Here is Deployement step'
                    echo "deployeing version ${params.VERSION}"
                }
            }
        }
    }





