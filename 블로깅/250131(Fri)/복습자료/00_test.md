```java 
int big;

if(num1 > num2) {
  big = num1;
} else {
  big = num2;
};

int diff;

if(num1 > num2) {
  diff = num1 - num2;
} else {
  diff = num2 - num1;
};


if(num1 > num2) {
  System.out.println("num1이 큼");
} else {
  System.out.println("num2가 큼");
};

// case 2 실행
// case 3 실행
// 실행 중단

Switch(rps) {
  case 0: 
    System.out.println("가위");
    break;
  case 1:
    System.out.println("바위");
    break;
  case 2:
    System.out.println("보");
    break;
  default:
    System.out.println("알수없음");
};
```