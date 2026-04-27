Vector: List 인터페이스를 구현합니다. (순서가 있고 중복을 허용)
Stack: Vector를 상속받으므로 List에 속합니다.
Stack이 Vector를 상속받는다: 맞습니다. 하지만 이는 설계상 문제가 있다고
여겨집니다. Stack은 LIFO 구조인데 Vector의 모든 메소드를 상속받아 중간 
요소에 접근할 수 있게 되기 때문입니다.

2. 왜 getName()은 자동으로 오름차순 같아 보일까요?
   2번 코드에서 이름을 비교할 때 썼던 s1.getName().compareTo(s2.getName())은 String 클래스가 미리 만들어둔 기준을 따르기 때문입니다.

자바의 String.compareTo()는 기본적으로 사전순(가나다순, ABC순) 오름차순으로 작동하도록 설계되어 있습니다.

따라서 우리가 별도의 계산을 하지 않고 compareTo 결과를 그대로 return하면 자동으로 오름차순 정렬이 되는 것입니다.

3. 2번에서 내림차순을 만들고 싶다면?
   만약 2번 방식(익명 객체)으로 이름이나 점수를 내림차순으로 만들고 싶다면, 순서만 살짝 바꿔주면 됩니다.

이름 내림차순: return s2.getName().compareTo(s1.getName()); (s2와 s1의 위치를 바꿈)

점수 내림차순: return s2.getScore() - s1.getScore();