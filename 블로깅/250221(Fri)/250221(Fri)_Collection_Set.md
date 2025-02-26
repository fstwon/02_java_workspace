# 250221(Fri)

# Java

# Collection - Set

## 1. 특징
- 순서가 없다.
- 중복이 허용되지 않는다. 

## 2. Hash(해쉬) 알고리즘
특정 기준에 따라 데이터를 분류하는 방식 (알고리즘)

### 중복 데이터 판단
Set 자료구조는 hashCode, equals 메소드를 사용하여 중복 데이터를 판단한다.
1. hashCode : 기준이 되는 값(데이터)를 정의
2. equals : hashCode 값이 같을 경우 동일 데이터를 판단하는 로직을 정의 

정리하면 같은 hashCode를 가지고 있으며 equals를 통해 데이터가 같으면 중복 데이터로 판단한다. 

### 메소드
1. 데이터 추가 : add(data)
2. 데이터 삭제 : remove(data)
3. 저장된 데이터 크기 : size()

### Set 클래스의 데이터 조회 
1. Iterator(반복자) 사용
    - Iterator 객체 생성 : Set변수명.iterator();
    - 데이터 유/무 판단 : Iterator변수명.hasNext();  // boolean 값 반환
    - 데이터 조회 : Iterator변수명.next();
```java
// Itrerator 
```
2. 향상된 for문(for-each) 
```java
for(Set에_지정한타입 변수명 : Set변수명) {
    변수명을 통해 데이터 접근
}
```
