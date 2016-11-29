package matitda.model.service;

import matitda.model.VO.MemberVO;

public interface MemberService {
	public int register(MemberVO vo) throws Exception;
	public void deleteMember(MemberVO vo) throws Exception;
	public MemberVO getMemberInfo(MemberVO vo)throws Exception;
	public Object idCheck(String id)throws Exception;
	public void update(MemberVO vo)throws Exception;
	public void updateProfile(MemberVO vo)throws Exception;
	public MemberVO login(MemberVO vo)throws Exception;
}
