#regex pattern

	read -p "Enter the name of user " user
	read -p "Enter the mobilenumber of user " mobilenum
  	read -p "Enter the password of user " passwd
	firstname="^[A-Z]{1}[a-z]{3,}$"
	lastname="^[A-Z]{1}[a-z]{3,}$"
	name="^[a-zA-Z]{1,}[0-9]*"
	optionalname="[._+-]{1,}[a-zA-Z0-9]+"
	emailname="[@][a-zA-Z0-9]+"
	emaillast="[.][a-z]{2,4}"
	optionallastname="[.][a-z]{2}"
	email="^[a-zA-Z]{1,}[0-9]*([._+-]{1}[a-zA-Z0-9]+){0,1}[@][a-zA-Z0-9]+[.][a-z]{2,4}([.][a-z]{2}){0,1}$"
	mobilenumber="^[9][1][[:space:]][6-9]{1}[0-9]{9}$"
	fullname="^[A-Z]{1}[a-z]{3,}[A-Z]{1}[a-z]{3,}$"
	password="[a-zA-Z]{8,}[0-9]*$"
	if [[ $user =~ $fullname ]]
	then
		echo "valid"
	else
		echo "not valid"
      fi   
	if [[ $mobilenum =~ $mobilenumber ]]
	then
		echo "Valid"
	else
		echo "NOt valid"
	fi
	if [[ $passwd =~ $password ]]
        then
                echo "Valid"
        else
                echo "NOt valid"
       fi


