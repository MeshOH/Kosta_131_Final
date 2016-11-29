package matitda.model.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import matitda.model.VO.MemberVO;
import matitda.model.service.impl.MemberServiceImpl;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

/*	public int register(MemberVO vo) throws Exception {
	public void deleteMember(MemberVO vo) throws Exception {
	public MemberVO getMemberInfo(MemberVO vo) throws Exception {
	public Object idCheck(String id) throws Exception {
	public void update(MemberVO vo) throws Exception {
	public void updateProfile(MemberVO vo) throws Exception {
	public MemberVO login(MemberVO vo) throws Exception {
*/
public class MemberController extends MultiActionController{
	private MemberServiceImpl memberServiceImpl;
	
	public MemberServiceImpl getMemberServiceImpl() {
		return memberServiceImpl;
	}
	public void setMemberServiceImpl(MemberServiceImpl memberServiceImpl) {
		this.memberServiceImpl = memberServiceImpl;
	}
	
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		return new ModelAndView();
	}
	
	public ModelAndView deleteMember(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		return new ModelAndView();
	}
	
	public ModelAndView getMemberInfo(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		return new ModelAndView();
	}
	
	public ModelAndView idCheck(HttpServletRequest request,HttpServletResponse response)throws Exception{
		return new ModelAndView();
	}
	
	public ModelAndView update(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		return new ModelAndView();
	}

	public ModelAndView updateProfile(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		return new ModelAndView();
	}
	
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,MemberVO vo)throws Exception{
		String memberId=request.getParameter("memberID");
		String password = request.getParameter("password");
		vo.setMemberId(memberId);
		vo.setPassword(password);
		MemberVO rvo=memberServiceImpl.login(vo);
		return new ModelAndView("index","vo",rvo);
	}
}
