# script-utility

개인적 용도를 위한 스크립트 소스 모음
Self-made Script Utilities for Personal Objects


## Convert

- 로컬 디렉토리 파일 업로드 확인
- .ks 확장자 정상 read 확인
- 다운로드 클릭시 최초 업로드 파일명 및 날짜로 txt 파일 생성 및 다운로드 가능

### V3 
- 자바스크립트
- 하나씩 파일 추가시 순서대로 컨버팅(정규식 replace된)된 스크립트 모아지고 한번에 다운로드 가능
- 여러개 추가해도 비동기 때문에 랜덤으로 스크립트 추가됨

### V4
- 순서 문제 해결
- 자바 단에서 파일 개개별로 저장 
- 정규식 문제로 컨버팅은 자바스크립트로 해결


## Translate

### V1
- 짧은 파일의 경우 파파고 번역 확인 완료
- 파일의 줄바꿈 영역 마다 substring 하여 한 줄씩 쿼리를 날리고 답을 받아 오는 것인데 일정 쿼리 이상일 시 시간 부하가 급속도로 걸리며 클라이언트 키 제한 넘을 시 쿼리 제한으로 오류 답변 날아옴.

### V2
- 브라우저 구글 번역 기능 사용
- 파일 오픈 시 html 영역에 해당 파일 그려짐
- 이후 해당 영역 텍스트 파일로 수동 저장


## Customize

### myDic V1
- static의 json 파일 자동 불러오기
- 소스 단에서 해당 번역 세팅 불러줌 ex. alice
- 파일 불러오면 자동 저장 됨.



## todo

- 네이버 파파고 API 연결 자동 컨버팅 -> 쿼리 제한 한계
- 번역 파일 다운로드



### 일지

- 2022-03-05 대량 컨버팅, 사전적용 완료
자바 이용한 자동저장 완료
크롬 브라우저 이용한 번역 수동 다운페이지 완료

- 2022-03-05 자바 프로젝트 추가
ConvertV4 작성(프로미스 실패), TranslateV1, myDicV1 작성 
파파고 번역 자동화를 위한 서버단 추가
프로젝트 설정 엉켜서 다 날리고 스프링 프로젝트로 새로 작성

- 2022-03-04 프로젝트 생성
ConvertV1, V2, V3 작성 
vanilaJS 통한 퀸로제 스크립트 -> 지시문 제외 대사 추출 정규식 적용  
txt 파일 업로드 및 컨버팅 된 파일 다운로드 지원