# Sintaxe Básica

## Condicionais

### If-Else-If

```
String weather = "Sunny";

if (weather == "Sunny"){
	
	System.out.println("There is a beatiful day outside.");

}
else if (weather == "Raining"){

	System.out.println("It is raining outside. You should take a umbrella.");
	
}
else if (weather == "Cloudy"){

	System.out.println("It might rain. You should take a umbrella.");

}
else {
	
	System.err.println("The weather variable wasn't recognized.");

}
```
### Switch
```
String weather = "Sunny";

switch (weather){
	
	case "Sunny":
		System.out.println("There is a beatiful day outside.");
		break;
		
	case "Raining":
		System.out.println("It is raining outside. You should take a umbrella.");
		break;
		
	case "Cloudy":
		System.out.println("It might rain. You should take a umbrella.");
		break;
		
	default:
		System.err.println("The weather variable wasn't recognized.");
		break;	
}
``` 
_Geralmente utiliza-se o switch para valores exatos e o if para expressões booleanas._