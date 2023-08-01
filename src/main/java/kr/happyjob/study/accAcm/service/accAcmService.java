package kr.happyjob.study.accAcm.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import kr.happyjob.study.accAcm.model.accAcmModel;
import kr.happyjob.study.accAcs.model.accAcsModel;
import kr.happyjob.study.mngNot.model.NoticeModel;
import kr.happyjob.study.system.model.ComnCodUtilModel;
import kr.happyjob.study.system.model.ComnDtlCodModel;
import kr.happyjob.study.system.model.ComnGrpCodModel;

@Service
public interface accAcmService {

	//계정대분류 목록 조회
	List<accAcmModel> accAcmSearchList(Map<String, Object> paramMap);

	//계정대분류 목록 개수 조회
	int countactlist(Map<String, Object> paramMap);

	//계정대분류 신규등록 삽입
	int bigInsert(Map<String, Object> paramMap);
	
	//계정상세 목록 조회
	List<accAcmModel> accAcmSListSearch(Map<String, Object> paramMap);

	//계정상세 목록 개수 조회
	int countSList(Map<String, Object> paramMap);

	//계정상세 신규등록 삽입
	int smallInsert(Map<String, Object> paramMap);

	//계정대분류코드 중복체크
	int LCdDupChked(Map<String, Object> paramMap);

	//계정대분류코드명 중복체크
	int LNmDupChked(Map<String, Object> paramMap);

	//계정상세코드 중복체크
	int SCdDupChk(Map<String, Object> paramMap);

	
}
