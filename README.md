# script-utility

개인적 용도를 위한 스크립트 소스 모음
Self-made Script Utilities for Personal Objects

에뮬 & 비쥬얼 노벨 & 오토메 게임 스크립트 추출 및 파일 컨버팅, 번역, 사전 적용 등

## Convert

- 로컬 디렉토리 파일 업로드 확인
- .ks 확장자 정상 read 확인
- 다운로드 클릭시 최초 업로드 파일명 및 날짜로 txt 파일 생성 및 다운로드 가능

### V3 
- 자바스크립트
- 하나씩 파일 추가시 순서대로 컨버팅(정규식 replace된)된 스크립트 모아지고 한번에 다운로드 가능
- 여러개 추가해도 비동기 때문에 랜덤으로 스크립트 추가됨

### V4
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

