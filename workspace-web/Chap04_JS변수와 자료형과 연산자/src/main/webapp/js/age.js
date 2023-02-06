function calc() {									//함수 calc()선언과 구현을 하고 있다.
			var currentYear = 2021;							//올해 년도를 변수 currentYear에 저장
			var birthYear = prompt("태어난 년도를 입력하세요.", "YYYY");	//사용자로부터 입력받은 값으로 변수 birthYear에 저장
			var age = 0;
			age = currentYear - birthYear +1;				//실제 나이구하기 위한 코드
			document.querySelector("#result").innerHTML = "당신의 나이는 " + age + "세 입니다.";
			/* document는 현재 브라우저의 페이지를 의미함
				querySelector() : id가 result인 웹 요소(div)를 의미함
				innerHTML : 대입한 값으로 html문서에 대체하라는 의미
				*/
		}