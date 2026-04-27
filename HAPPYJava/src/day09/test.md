“final은 불변(immutable)이 아니라, ‘재할당 금지’다”

❗ 헷갈리는 부분
final List<String> list = new ArrayList<>();
list.add("A"); // ✅ 가능

👉 완전히 불변 ❌
👉 참조만 고정

Object에 toString 항상 적용중

'==' 주소(참조) 비교
equals 값 비교