package com.bottle.study_springboots.service;

import java.util.ArrayList;

import com.bottle.study_springboots.beans.BoardBean;

public class DataInfors {
    
    public ArrayList<BoardBean> getDataListWithBoardBean() {
        ArrayList<BoardBean> membersList = new ArrayList<>();
        BoardBean boardBean = new BoardBean();
        boardBean.setTitle("서울 지하철역사에 UAM 복합환승센터 짓는다");
        boardBean.setContent("서울 주요 지하철 역사에 도심항공교통(UAM) 복합 환승센터 건립이 추진된다. LG유플러스는 서울교통공사와 UAM 복합 환승센터 조성과 UAM 조기 상용화 협력을 위한 업무협약(MOU)을 맺었다고 15일 발표했다. 이번 협약에 따라 서울교통공사는 복합 환승센터 도입을 위한 행정 사항과 수직 이착륙 비행장(버티포트) 인프라를 지원한다. 삼성역 수서역 구로디지털단지 같은 지하철, 수도권 광역급행철도(GTX), 버스 등 교통 이용객이 많은 지하철 역사를 중심으로 복합 환승센터를 도입할 방침이다. 서울교통공사는 지하철 1~8호선 도시철도에 275개 역사를 보유 중이다. LG유플러스는 노선 운영을 위한 교통관리 시스템을 개발한 뒤 UAM 관련 통신 기술 실증에 나선다. 이뿐만 아니라 양사는 UAM 실현 가능성, 기술 안정성, 지역 주민의 수용성 등 비행 환경 조사는 물론 비행경로에 따른 기상 조건, 비행 장애물 등 환경적 요소에 대한 사전 연구를 함께 추진할 예정이다. UAM은 전기식 수직 이착륙 비행체(eVTOL)를 이용해 도심 내 짧은 거리를 빠르게 이동할 수 있는 차세대 교통체계다. LG유플러스는 작년 5월 카카오모빌리티, GS건설 등과 컨소시엄을 구성해 국토부의 ‘K-UAM 그랜드챌린지’ 실증 사업에 참여하고 있다. 부산시와 UAM 생태계 조성을 위한 MOU를 체결하기도 했다. 진영서 LG유플러스 기업서비스개발랩장은 “UAM 초기 시장을 만들어가는데 서울교통공사와의 협력이 중요한 역할을 할 것”이라며 “컨소시엄 참여사들과도 협력을 지속해 미래 교통 인프라를 구축해가겠다”고 말했다.");
        boardBean.setUserName("이승우 기자");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("RFA 북 해킹조직, 카카오 위장 비번 탈취 피싱 공격");
        boardBean.setContent("이번에 발견된 피싱 메일은 '[긴급] 지금 바로 비밀번호를 변경해주세요.'라는 제목으로 유포됐으며, 카카오 기업 소유의 다음 이메일 서비스를 위장하고 있다.공격에 사용된 이메일 발신자 주소는 'daum'과 유사한 'daurn'으로, 이는 다음의 공식 이메일인 것처럼 만들어 사용자들에게 혼란을 야기하려는 의도로 파악된다.이스트시큐리티는 여러 지표들을 분석한 결과 이번 공격의 배후가 북한 정찰총국의 지원을 받는 해킹조직 김수키인 것으로 결론지었다고 밝혔다.");
        boardBean.setUserName("김지은 기자");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);

        boardBean = new BoardBean();
        boardBean.setTitle("“韓 원자력 UAE 수출 6개월 빨라진다");
        boardBean.setContent("이번 행정약정 체결로 원자력 수출허가 업무에 있어서는 원안위와 FANR이 직접 처리할 수 있게 되었으며, 그 결과 핵연료 공급사업, 원전 유지보수 사업 등 향후 예상되는 수출허가에 소요되는 시간이 최대 6개월 단축되는 효과가 있을 것으로 예상된다. 양국은 UAE 바라카 원전 수출을 계기로 원자력 안전규제 협력을 위해 원안위-FANR 협력약정을 체결했으며, 이후 바라카 원전의 건설 및 운영 단계별 규제경험과 정보 공유를 위해 정례적으로 양자회의를 개최하고 있다. 유국희 원안위 위원장은 UAE 현지에서 “양국 정상회담을 계기로 지난 10여 년간 양 기관의 협력이 행정약정 체결이라는 새로운 결실을 맺게 되어 매우 뜻깊게 생각한다”며 “양 기관이 직접 소통할 수 있는 체계가 마련돼 향후 협력이 더욱 강화될 것으로 기대한다”고 전했다.");
        boardBean.setUserName("구본혁 기자");
        boardBean.setDate("2023-01-15");
        membersList.add(boardBean);
        return membersList;
    }

    public BoardBean getDataWithMemberBean(String title){
        ArrayList<BoardBean> memberList = getDataListWithBoardBean();
        BoardBean boardBean = new BoardBean();
        for(BoardBean member : memberList) {
            if(member.getTitle().equals(title)) {
                boardBean.setTitle(member.getTitle());
                boardBean.setContent(member.getContent());
                boardBean.setUserName(member.getUserName());
                boardBean.setDate(member.getDate());
                return boardBean;
            } 
        }
        boardBean.setTitle("에러) 없습니다");
        boardBean.setContent("Otto");
        boardBean.setUserName("@mdo");

        return boardBean;
    }
}
