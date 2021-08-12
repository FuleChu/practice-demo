package com.chu.practicedemo.service.impl;


import com.chu.practicedemo.module.User;
import com.sun.istack.internal.NotNull;
import org.springframework.util.Assert;


import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * rpc上下文，用于携带rpc参数
 *
 * @author zengxc
 */
public class RpcContext {


	private static final ThreadLocal<RpcContext> JWT_LOCAL = ThreadLocal
			.withInitial(() -> new RpcContext());

	private static final ThreadLocal<User> threadLocal2 = new ThreadLocal<>();

	public static void open2(String s){
		User user = threadLocal2.get();
//		user.setId(1);
	}

	public static User get2(){
		return threadLocal2.get();
	}


	// ========公共参数========
	/**
	 * 应用名称
	 */
	private static String applicationName;

	/**
	 * jwt加密密钥
	 */
	private static String secret;

	/**
	 * jwt过期时间(单位秒)
	 */
	private static int timeOut = 60;

	// =======================

	// ========私有参数========
	/**
	 * rpc状态：true 为开启
	 */
	private boolean status;

	/**
	 * jwt token
	 */
	private String token;

	/**
	 * 租户ID
	 */
	private String tenantId;
	/**
	 * 应用ID
	 */
	private String appId;
	/**
	 * 部门可见范围
	 */
	private List<Long> departmentIds;
	/**
	 * 人员可见范围
	 */
	private List<Long> personIds;

	/**
	 * 标签可见范围
	 */
	private List<Long> tagIds;

	/**
	 * 自定义参数
	 */
	protected final Map<String, Object> attachments = new HashMap<>();

	// =======================

	/**
	 * 初始化
	 * @param applicationName 应用名称
	 * @param secret JWT 加密密钥
	 */
	public static void initContext(String applicationName, String secret) {
		RpcContext.applicationName = applicationName;
		RpcContext.secret = secret;
	}

	/**
	 * 开启上下文
	 * @param tenantId 租户ID
	 */
	public static void open(@NotNull String tenantId) {
		open(tenantId, null);
	}

	/**
	 * 开启jwt
	 * @param tenantId 租户ID
	 * @param appId 应用ID
	 */
	public static void open(@NotNull String tenantId, String appId) {
		RpcContext context = JWT_LOCAL.get();
		context.tenantId = tenantId;
		context.appId = appId;
//		context.createToken();
		context.status = true;
	}

	/**
	 * 关闭jwt
	 */
	public static void close() {
		JWT_LOCAL.remove();
	}

	/**
	 * jwt状态
	 * @return
	 */
	public static boolean status() {
		return JWT_LOCAL.get().status;
	}

	public RpcContext setAttachments(String key, Object value) {
		return setObjectAttachment(key, value);
	}

	public RpcContext setObjectAttachment(String key, Object value) {
		if (value == null) {
			attachments.remove(key);
		}
		else {
			attachments.put(key, value);
		}
		return this;
	}

	public String getToken() {
		return token;
	}

	public static RpcContext getContext() {
		return JWT_LOCAL.get();
	}

	public static void setContext(RpcContext rpcContext) {
		JWT_LOCAL.set(rpcContext);
	}

	/**
	 * 设置签名过期时间（秒）默认60秒
	 * @param amount
	 */
	public static void setTimeOut(int amount) {
		RpcContext.timeOut = amount;
	}

	/**
	 * 创建一个Token
	 * @return
	 */
//	private void createToken() {
//		Assert.notNull(applicationName, "请先执行initContext方法进行初始化");
//		Assert.notNull(tenantId, "tenantId不允许为null");
//		try {
//			attachments.put("tenantId", tenantId);
//			if (appId != null) {
//				attachments.put("appId", appId);
//			}
//			Calendar cal = Calendar.getInstance();
//			cal.add(Calendar.SECOND, timeOut);
//			token = JWT.create().withIssuer(applicationName).withExpiresAt(cal.getTime())
//					.withSubject(JSON.toJSONString(attachments))
//					.sign(Algorithm.HMAC256(secret));
//		}
//		catch (UnsupportedEncodingException exception) {
//			log.error(exception.getMessage());
//		}
//		catch (JWTCreationException exception) {
//			log.error(exception.getMessage());
//		}
//	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public List<Long> getPersonIds() {
		return personIds;
	}

	public void setPersonIds(List<Long> personIds) {
		this.personIds = personIds;
	}

	public List<Long> getDepartmentIds() {
		return departmentIds;
	}

	public void setDepartmentIds(List<Long> departmentIds) {
		this.departmentIds = departmentIds;
	}

	public List<Long> getTagIds() {
		return tagIds;
	}

	public void setTagIds(List<Long> tagIds) {
		this.tagIds = tagIds;
	}
}
