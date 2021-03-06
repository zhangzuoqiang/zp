package com.dophin.enums;

/**
 * 对接submail短信报错错误码
 * 
 * @author dailiwei
 * 
 */
public enum SmsErrorEnum {

	Code101(101, "不正确的 APP ID"),

	Code102(102, "此应用已被禁用，请至 submail > 应用集成 > 应用 页面开启此应用"),

	Code103(103, "未启用的开发者，此应用的开发者身份未验证，请更新您的开发者资料"),

	Code104(104, "此开发者未通过验证或此开发者资料发生更改。请至应用集成页面更新你的开发者资料"),

	Code105(105, "此账户已过期"),

	Code106(106, "此账户已被禁用"),

	Code107(107, "sign_type （验证模式）必须设置为 MD5（MD5签名模式）或 SHA1（SHA1签名模式）或 normal (密匙模式)."),

	Code108(108, "signature 参数无效"),

	Code109(109, "appkey 无效"),

	Code110(110, "sign_type 错误"),

	Code111(111, "空的 signature 参数"),

	Code112(112, "应用的订阅与退订功能已禁用。"),

	Code113(113, "请求的 APPID 已设置 IP 白名单，您的 IP 不在此白名单范围"),

	Code114(114, "该手机号码在账户黑名单中，已被屏蔽"),

	Code115(115, "该手机号码请求超限"),

	Code116(116, "签名错误，该签名已被其他应用使用并已申请固定签名"),

	Code117(117, "该模板已失效，短信模板签名与固定签名不一致或你的账户已取消固签，请联系 SUBMAIL 管理员"),

	Code118(118, "该模板已失效，请联系SUBMAIL管理员"),

	Code151(151, "错误的 UNIX 时间戳"),

	Code152(152, "错误的 UNIX 时间戳，请将请求 UNIX 时间戳 至 发送 API 的过程控制在6秒以内"),

	Code201(201, "未知的 addressbook 模式"),

	Code202(202, "错误的收件人地址"),

	Code203(203, "错误的收件人地址。如果你正在使用 adressbook , 你所标记的地址薄不包含任何联系人"),

	Code204(204, "请将收件人名称 （to_name）控制在50个字符以内。"),

	Code205(205, "错误的发件人地址。"),

	Code206(206, "错误的发件域。在此域名被 SUBMAIL 验证之前，你不能使用此域 $fromDomain 发送任何邮件"),

	Code207(207, "请将发件人名称（from_name）控制在50个字符以内。"),

	Code208(208, "错误的回复地址"),

	Code209(209, "请将抄送联系人（cc）控制在10个以内。"),

	Code210(210, "请将暗送联系人（bcc）控制在10个以内。"),

	Code211(211, "to 和 to_name 参数不匹配，多个收件人和收件人称谓需要严格匹配"),

	Code213(213, "此联系人已退订你的邮件系统。"),

	Code215(215, "错误的收件人地址。"),

	Code216(216, "错误的收件人地址。"),

	Code217(217, "错误的收件人地址。"),

	Code251(251, "错误的收件人地址（message）"),

	Code252(252, "错误的收件人地址（message）, 如果你正在使用 adressbook 模式，你所标记的地址薄不包含任何联系人。"),

	Code253(253, "此联系人已退订你的短信系统。"),

	Code270(270, "你的联系人总数已超过15万最大限制"),

	Code301(301, "邮件标题不能为空。"),

	Code302(302, "请将邮件标题控制在100个字符以内。"),

	Code303(303, "没有填写邮件内容。"),

	Code304(304, "错误的邮件类型。邮件类型（type）参数必须设置为 html 或 text。"),

	Code305(305, "没有填写项目标记"),

	Code306(306, "无效的项目标记"),

	Code307(
			307,
			"错误的 json 格式。 请检查 vars 和 links 参数, 注：当 API  返回 307 错误时，服务器会给出具体的 JSON decoding 错误原因。"
					+ "json_decoding_error 参数将以数字形式标注错误代码, json_decoding_error:, 1 = 到达了最大堆栈深度, 2 = 无效或异常的 JSON, 3 = 控制字符错误，可能是编码不对, "
					+ "4 = 语法错误, 5 = 异常的 UTF-8 字符，也许是因为不正确的编码"),

	Code308(308, "附件大小超过最大可接受的范围，请将附件大小的总和控制在 10 MB 以内。"),

	Code309(
			309,
			"错误的 json 格式。 请检查 headers 参数, 注：当 API 返回 309 错误时，服务器会给出具体的 JSON decoding 错误原因。"
					+ "json_decoding_error 参数将以数字形式标注错误代码, json_decoding_error:, 1 = 到达了最大堆栈深度, 2 = 无效或异常的 JSON, 3 = 控制字符错误，可能是编码不对, "
					+ "4 = 语法错误, 5 = 异常的 UTF-8 字符，也许是因为不正确的编码"),

	Code401(401, "短信签名不能为空。"),

	Code402(402, "请将短信签名控制在40个字符以内。"),

	Code403(403, "短信正文不能为空"),

	Code404(404, "请将短信内容（加上签名）控制在400个字符以内。"),

	Code405(405, "依据当地法律法规，以下’$var’词或短语不能出现在短信中。"),

	Code406(406, "项目标记不能为空"),

	Code407(407, "无效的项目标记"),

	Code408(408, "你不能向此联系人或此地址簿中包含的联系人发送完全相同的短信。"),

	Code409(409, "尝试发送的短信项目正在审核中，请稍候再试。"),

	Code410(410, "multi 参数无效"),

	Code501(501, "错误的目标地址簿标识"),

	Code901(901, "你今日的发送配额已用尽。如需提高发送配额，请至 submail > 应用集成 >应用 页面开启更多发送配额"),

	Code902(902, "您的邮件发送许可已用尽或您的余额不支持本次的请求数量。如需继续发送，请至 submail.cn > 商店 页面购买更多发送许可后重试"),

	Code903(903, "您的短信发送许可已用尽或您的余额不支持本次的请求数量。如需继续发送，请至 submail.cn > 商店 页面购买更多发送许可后重试。");

	private int code;
	private String desc;

	private SmsErrorEnum(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
