node{

stage('Testing'){
	choice1 = input( id: 'userInput', message: 'Select your choice', parameters: [ [$class: 'ChoiceParameterDefinition', choices: 'aa\nbb', description: '', name: ''] ])
        if(choice1.equals("aa")){
            choice2 = input( id: 'userInput', message: 'Select your choice', parameters: [ [$class: 'ChoiceParameterDefinition', choices: 'yy\nww', description: '', name: ''] ])
        }else{
            
	choice2 = input( id: 'userInput', 
				message: 'Select your choice', 
				parameters: [ $class: 'ChoiceParameter', 
						choiceType: 'PT_SINGLE_SELECT', 
						description: 'Testing',
						filterLength: 1, 
						filterable: false, 
						name: 'ActiveChoiceParameter',
						randomName: 'choice-parameter-319585721038197', 
						script: [$class: 'GroovyScript', 
						fallbackScript: [classpath: [], 
						sandbox: false, 
						script: '''one 
								two'''], 
						script: [classpath: [], 
								sandbox: false, 
								script: '''One
								Two
								Three
								four''']] ])
        }
	echo 'Testing'
	
	}
stage('Stage-2'){

	echo 'Stage-2 testing'
}

}

				


