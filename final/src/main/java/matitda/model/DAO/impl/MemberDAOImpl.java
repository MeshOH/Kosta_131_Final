package matitda.model.DAO.impl;

import matitda.model.DAO.MemberDAO;
import matitda.model.VO.MemberVO;

import org.apache.ibatis.session.SqlSession;

public class MemberDAOImpl implements MemberDAO {
	private SqlSession sqlSession;
	
	
	public SqlSession getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int register(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("Member.register",vo);
	}

	@Override
	public void deleteMember(MemberVO vo) throws Exception {
		sqlSession.delete("Member.deleteMember",vo);
	}

	@Override
	public MemberVO getMemberInfo(MemberVO vo) throws Exception {
		MemberVO rvo = sqlSession.selectOne("Member.getMemberInfo", vo);
		return rvo;
	}

	@Override
	public Object idCheck(String id) throws Exception {
		return sqlSession.selectOne("Member.idCheck",id);
	}

	@Override
	public void update(MemberVO vo) throws Exception {
		sqlSession.update("Member.update",vo);
	}

	@Override
	public void updateProfile(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.update("Member.updateProfile",vo);
	}

	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("Member.login",vo);
	}

}
