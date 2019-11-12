package com.im.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.stereotype.Service;

import com.im.dao.InvitationDao;
import com.im.pojo.Invitation;

@Service
public class InvitationServiceImpl implements InvitationService {
	@Resource
	private InvitationDao invitationDao;
	@Test
	public void test(){
		List<Invitation> list = invitationDao.find();
		System.out.println(list);
	}

	@Override
	public List<Invitation> find() {
		List<Invitation> list = invitationDao.find();
		return list;
	}

	@Override
	public Invitation find(int id) {
		Invitation invitation = invitationDao.findById(id);
		return invitation;
	}

	@Override
	public boolean insert(Invitation invitation) {
		invitation.setCreatedate(new Date(System.currentTimeMillis()));
		return invitationDao.insert(invitation) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] ids) {
		if (ids != null) {
			return invitationDao.delete(ids) > 0 ? true : false;
		} else {
			return false;
		}
	}

	@Override
	public boolean update(Invitation invitation) {
		return invitationDao.update(invitation) > 0 ? true : false;
	}

}
