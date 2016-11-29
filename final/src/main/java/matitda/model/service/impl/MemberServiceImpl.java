package matitda.model.service.impl;

import matitda.model.DAO.MemberDAO;
import matitda.model.VO.MemberVO;
import matitda.model.service.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	
	public MemberDAO getMemberDAO() {
		return memberDAO;
	}

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public int register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.register(vo);
	}

	@Override
	public void deleteMember(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.deleteMember(vo);
	}

	@Override
	public MemberVO getMemberInfo(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.getMemberInfo(vo);
	}

	@Override
	public Object idCheck(String id) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.idCheck(id);
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.update(vo);
	}

	@Override
	public void updateProfile(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		memberDAO.update(vo);
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return memberDAO.login(vo);
	}
}
