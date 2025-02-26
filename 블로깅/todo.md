우선순위: 1, 2, 3, ...

1. 교육
- java 미니 프로젝트 (1)
    - 기획서 작성(ppt 정리, 구글 slides)
    - 관계도 우선 작성
    - 클래스 다이어그램 작성(draw.io)
    - 개발(eclipse)

- 프로젝트 구조 개선
    [게임 런쳐 프로젝트]
        1. GameLauncher : 최종 프로그램 실행 클래스. LauncherView 클래스의 mainMenu 메소드 호출 

        2. LauncherView : 플레이어가 확인하고 선택할 수 있는 메뉴를 보여주는 클래스. 플레이어의 입력 값까지만 받고 모든 연산 작업은 GameController로 위임한다.
        Fst Games라는 텍스트 이미지를 출력하고 아래 목록을 보여준다. 
        - 메뉴 목록
            1. 게임 시작 (Press any key to start)
                1. id와 이름을 입력 받는다.
            2. 끝내기
        id와 이름을 입력받고 GameController에 전달한다.
        GameController에서 id와 이름 입력이 잘 되었으면 실행할 게임 목록을 보여준다.
        실행할 게임을 선택하면 해당 게임의 정보를 GameController에 전달한다. GameController에서 전달 받은 메소드를 실행 시킨다.

        3. GameController : 플레이어의 id와 입력 값을 가지고 있다. LauncherView에서 전달 받은 게임의 정보를 가지고 게임 실행 메소드를 LauncherView로 전달한다. 

        4. GameDAO : 게임 목록의 정보를 가지고 있다. 게임 목록의 게임들은 sn, title, mainTitle 등 게임목록(gameList.txt) 파일에 간단하게 읽고 쓸 수 있다. GameDAO에서 가지고 있는 게임 목록은 LauncherView에서 GameController로 전달 받은 값으로 실행하고 싶은 게임을 찾을 수 있다. 

        5. Game : 새로운 게임을 추가하고자 할 때 상속 또는 구현해야하는 기본적인 정보와 GameController에서 찾은 게임으로 현재 실행하고 있는 게임 정보 객체를 생성할 수 있다. 

        6. PlayerManager : LauncherView에서 GameController로 전달된 값을 다시 전달 받아 플레이어 목록 파일(player.txt)의 정보를 추가, 삭제, 수정할 수 있다. 

        7. Player : 프로그램 실행 중 입력된 플레이어의 이름, 아이디 등 필요한 정보를 가지고 있다. 

    [행맨 게임 프로젝트]
    1. HangmanRun : 행맨 게임을 실행하는 클래스. HangmanView 클래스의 mainMenu 메소드 호출

    2. HangmanView : LauncherView와 마찬가지로 플레이어의 입력 값까지만 받고 모든 연산 작업은 GameController로 위임한다. mainMenu 메소드를 호출하면 우선 아래 메뉴를 보여준다. 
        - 메뉴 목록
            1. 게임 시작
            2. 메인으로 돌아가기

    3. HangmanController : HangmanView에서 플레이어에게 입력 받은 값으로 연산한 후 새로 또는 다시 보여져야 하는 데이터를 HangmanView에 전달한다. 

    4. Hangman : Game 클래스에서 상속 받은 데이터를 가지고 있고 행맨 게임과 관련 또는 필요한 정보를 가지고 있다. 

    5. Word : 게임을 플레이하는 데 필요한 단어 정보를 가지고 있다. 단어 목록을 파일(wordList.txt)에 읽고 쓸 수 있어야 하며 게임을 플레이 하는데 필요한 필드와 메소드를 가지고 있다.

    게임 런쳐 프로젝트가 메인 프로젝트이며 둘 다 독립된 프로젝트로 진행한다. 게임 런쳐 프로젝트에서 실행할 수 있는 방법으로는 게임 프로젝트를 빌드하고 게임 런쳐 프로젝트에 추가하여 독립적으로 실행시키지만 게임 런쳐는 플레이어가 직접 종료하지 않는 이상 게임이 돌아가는 동안도 정보가 유지되어야 한다.


2. 개인
- 1일 1 블로깅 [default]
- cj enm mnet plus 자기소개서
- 포트폴리오