#短信模板增加渠道字段，支持多渠道
alter table sms_message_template add channel tinyint(4) NOT NULL DEFAULT '0' COMMENT '0-亿美三网合一999通道, 1-亿美106共享营销短信通道' AFTER `state`;

#重置模板类型
update email_message_template set type=0;
update sms_message_template set type=0;
update push_message_template set type=0;
#当前站内信都是交易类型
update site_message_template set type=1;
update site_message_content set type=1;

/***site_message_template**/
/***8个停用**/
UPDATE `site_message_template`
SET `state` = '1',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` IN (
		'1',
		'2',
		'3',
		'4',
		'5',
		'6',
		'16',
		'18'
	);

/***content内容修改**/
UPDATE `site_message_template`
SET `content` = '您提交的的认证和服务材料已审核成功，完成签约即可申请融资！',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '7';

UPDATE `site_message_template`
SET `content` = '您与${核心企业名称}的融资合同已签署生效，当前可用额度${availablequota}元。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '8';

UPDATE `site_message_template`
SET `content` = '${用户所属企业名称}与${核心企业名称}的融资合同暂时中止，合同编号：${contractid}。如有疑问或需申请重新启用合同请致电4006228098。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '9';

UPDATE `site_message_template`
SET `content` = '${用户所属企业名称}与${核心企业名称}的融资合同已恢复履行，合同编号：${contractid}。如有疑问或其他需要请致电4006228098。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '10';

UPDATE `site_message_template`
SET `content` = '${用户所属企业名称}与${核心企业名称}的融资合同已终止，合同编号：${contractid}。如有疑问或需申请重新启用合同请致电4006228098。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '11';

UPDATE `site_message_template`
SET `content` = '您的额度已解冻，可正常申请融资，当前可用额度${availablequota}元，可融资单据xx条，可融资金额xx元。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '12';

UPDATE `site_message_template`
SET `content` = '您有${count}条与${核心企业名称}的交易可申请融资，融资款项共计${融资总额}元。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '13';

UPDATE `site_message_template`
SET `content` = '您有${count}笔与${核心企业名称}的已融资交易单据，共计${amount}元，今天${X月X日}是最后还款日，请及时还款避免影响信用记录。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '19';

UPDATE `site_message_template`
SET `content` = '您有${count}笔与${核心企业名称}的已融资交易单据，共计${amount}元，最后还款日${X月X日}已过，尚未收到您的还款。请及时还款避免影响信用记录。如有问题请致电4006228098。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '20';

UPDATE `site_message_template`
SET `content` = '您有${count}笔交易${amount}元于本日到期，请及时安排还款。如有问题请致电4006228098',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '24';

UPDATE `site_message_template`
SET `content` = '您有${count}笔交易共计${amount}元已逾期，请及时还款，还款后可恢复您的信用。如有问题请致电4006228098',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '25';

UPDATE `site_message_template`
SET `content` = '您有${count}笔交易${amount}元，于${duedate}到期，${days}天内还入约定账户中，将视同按时还款。如有问题请致电4006228098',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '26';

UPDATE `site_message_template`
SET `content` = '您有${count}笔交易，${amount}元，于${duedate}到期，如本日仍未还款将视为逾期。请及时安排还款。如有问题请致电4006228098',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '27';

UPDATE `site_message_template`
SET `content` = '您有1笔支付货款交易${paymentamt}元已完成还款。',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '28';

/***修改type**/
UPDATE `site_message_template`
SET `type` = '1',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` IN (
		'7',
		'8',
		'9',
		'10',
		'11',
		'12',
		'13',
		'14',
		'15',
		'17',
		'19',
		'20',
		'21',
		'22',
		'23',
		'24',
		'25',
		'26',
		'27',
		'28',
		'29',
		'30',
		'31'
	);

/***sender修改**/
UPDATE `site_message_template`
SET `sender` = '【签约提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '7';

UPDATE `site_message_template`
SET `sender` = '【合同管理】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '8';

UPDATE `site_message_template`
SET `sender` = '【额度解冻】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '12';

UPDATE `site_message_template`
SET `sender` = '【可融资提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '13';

UPDATE `site_message_template`
SET `sender` = '【保证金缴纳】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '14';

UPDATE `site_message_template`
SET `sender` = '【保证金缴纳】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '15';

UPDATE `site_message_template`
SET `sender` = '【还款成功】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '17';

UPDATE `site_message_template`
SET `sender` = '【还款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '19';

UPDATE `site_message_template`
SET `sender` = '【还款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '20';

UPDATE `site_message_template`
SET `sender` = '【息费支付】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '21';

UPDATE `site_message_template`
SET `sender` = '【息费支付】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '22';

UPDATE `site_message_template`
SET `sender` = '【逾期通知】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '23';

UPDATE `site_message_template`
SET `sender` = '【还款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '24';

UPDATE `site_message_template`
SET `sender` = '【逾期通知】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '25';

UPDATE `site_message_template`
SET `sender` = '【还款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '26';

UPDATE `site_message_template`
SET `sender` = '【还款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '27';

UPDATE `site_message_template`
SET `sender` = '【还款成功】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '28';

UPDATE `site_message_template`
SET `sender` = '【付款提醒】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '29';

UPDATE `site_message_template`
SET `sender` = '【提现失败】',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` = '31';
	
/***sms_message_template**/
/***content 内容修改**/
UPDATE `sms_message_template`
SET `content` = '您好！群星金融网携手${inviteCustomerName}开启针对全国经销商的互联网融资服务通道。您的融资额度：${creditQuota}元，签约后可立即使用。您的注册邀请码：${captcha}，下载APP即可完成注册，点击下载链接：http://m.iqunxing.com/d.htm 开始体验吧。如不再接收该消息，回复TD退订。',
 `updated_time` = NOW(),
 `updated_by` = 'DCF'
WHERE
	`id` = '1';

UPDATE `sms_message_template`
SET `content` = '您好！群星金融网携手${inviteCustomerName}提供互联网订单管理平台，单据管理、快捷支付，尽在群星金融网。您的注册邀请码：${captcha}，下载APP即可完成注册，点击下载链接：http://m.iqunxing.com/d.htm开始体验吧。如不再接收该消息，回复TD退订。',
 `updated_time` = NOW(),
 `updated_by` = 'DCF'
WHERE
	`id` = '45';

UPDATE `sms_message_template`
SET `content` = '您好！群星金融网携手资金方开启针对全国保理商的供应链金融综合服务通道，为您提供丰富的资金产品支持。如果您有客户资源，与群星合作即可变现，预知详情，立即注册即可知晓。您的注册链接：${inviteCode} 点击开始体验吧！如不再接收该消息，回复TD退订。',
 `updated_time` = NOW(),
 `updated_by` = 'DCF'
WHERE
	`id` = '50';

UPDATE `sms_message_template`
SET `content` = '您好！群星金融网携手资金方开启针对全国保理商的供应链金融综合服务通道，为您提供丰富的资金产品支持。如果您有客户资源，与群星合作即可变现！您的注册邀请码：${inviteCode}，下载APP即可完成注册，点击下载链接：http://m.iqunxing.com/org.html 开始体验吧！如不再接收该消息，回复TD退订。',
 `updated_time` = NOW(),
 `updated_by` = 'DCF'
WHERE
	`id` = '51';

/***修改type**/
UPDATE `sms_message_template`
SET `type` = '1',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` IN ('1', '45', '50', '51');

UPDATE `sms_message_template`
SET `type` = '1',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` IN ('3', '19');

UPDATE `sms_message_template`
SET `type` = '1',
 updated_time = NOW(),
 updated_by = 'DCF'
WHERE
	`id` IN (
		'2',
		'4',
		'5',
		'6',
		'7',
		'8',
		'9',
		'10',
		'11',
		'12',
		'13',
		'14',
		'15',
		'16',
		'17',
		'18',
		'20',
		'21',
		'22',
		'23',
		'24',
		'25',
		'26',
		'27',
		'28',
		'29',
		'30',
		'31',
		'32',
		'33',
		'34',
		'35',
		'36',
		'37',
		'38',
		'39',
		'40',
		'41',
		'42',
		'43',
		'44',
		'46',
		'47',
		'48',
		'49'
	);
