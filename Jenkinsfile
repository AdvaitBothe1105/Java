pipeline {
  agent any
  stages {
    stage('maven install') {
      steps {
                          withMaven(globalMavenSettingsConfig: '', jdk: '', maven: 'maven1', mavenSettingsConfig: '', traceability: true) {
              // some block
          }
      }
    }

  }
}
