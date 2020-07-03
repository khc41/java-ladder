# 사다리 게임
## 진행 방법
* 사다리 게임 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/nextstep-step/nextstep-docs/tree/master/codereview)

##기능 요구사항
### User
- 이름필드
- 이름 문자에 대한 valid검증
    * 이름 길이 체크(최대5글자)
- 이름 길이가 5글자 미만이라도 5글자로 출력

### InputUtil
- ,를 기준으로 파싱하여 List로 반환한다.
- null과 공백에 대한 체크

### Line 이동선
- 이동선이 그려져있으면 True/ 없으면 False (boolean 타입)
- 이동선 True값은 연속으로 존재할 수 없다. (즉 |-----|-----| 불가)
- List<boolean> 형태의 자료구조를 갖는다.

### Ladder 사다리
- 유저 수에 맞춰 해당 갯수만큼 생성된다.
- 입력받은 높이에 맞춰 높이가 그려진다.
- 사다리는 높이보다 많은 Line을 가질수 없다.

 
