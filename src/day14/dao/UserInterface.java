package day14.dao;

//���� �������ĵĹ���
public interface UserInterface {
	/**
	 * ע�Ṧ��
	 * 
	 * @param name
	 * @param pwd
	 */
	public void register(String name, String pwd);

	/**
	 * �û���¼
	 * 
	 * @param name
	 * @param pwd
	 * @return
	 */
	public boolean login(String name, String pwd);

	/**
	 * �޸�����
	 * 
	 * @param name
	 *            �û���
	 * @param oldPwd
	 *            ������
	 * @param newPwd
	 *            �µ�����
	 * @return
	 */
	public boolean rePassword(String name, String oldPwd, String newPwd);

	/***
	 * �޸��û���Ϣ
	 * 
	 * @param uid
	 * @param nickName
	 * @return
	 */
	public boolean editPersonInfo(String uid, String nickName);

}
