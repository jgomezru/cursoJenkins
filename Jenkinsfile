pipeline{ // este fichero lo guardaria dentro de la carpeta raiz del proyecto
    agent any
    stages{
        stage('Repositorio'){
            steps {echo 'Clonamos repositorio'
                //aqui iria la url del repositorio
            } //stage repositorio
            
        }
        stage('Empaquetado'){
            steps {echo 'Empaquetado con maven'
                sh 'exit 0' // mvn package aqui haria el package
            }
            
        } //stage empaquetado
        stage('Despliegue'){
            steps {echo 'Aqui iria el despliegue,colgarlo en Tomcat'}
            
        }//fin despliegue
    }//fin stages
    post {
        always{
            echo 'Post se ejecuta siempre'
            
        }
        success{
            echo 'Post cuando ha ido bien' 
            sh 'exit 1'
            
        }
        failure{
            echo 'Post si ha ido mal'  
            sh 'exit 0'
            
        }
        changed{
            echo 'Post si el estado es distinto al de la anterior ejecucion'
            
        }
    }
    
}
    
