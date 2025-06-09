
var projectName = '疫情社区管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '医疗专家',
	url: './pages/yiliaozhuanjia/list.html'
}, 
{
	name: '志愿者信息',
	url: './pages/zhiyuanzhexinxi/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
{
	name: '疫情公告',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssme38qz/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医疗专家","menuJump":"列表","tableName":"yiliaozhuanjia"}],"menu":"医疗专家管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"专家咨询","menuJump":"列表","tableName":"zhuanjiazixun"}],"menu":"专家咨询管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"预约信息","menuJump":"列表","tableName":"yuyuexinxi"}],"menu":"预约信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康档案","menuJump":"列表","tableName":"jiankangdangan"}],"menu":"健康档案管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"志愿者信息","menuJump":"列表","tableName":"zhiyuanzhexinxi"}],"menu":"志愿者信息管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"报名信息","menuJump":"列表","tableName":"baomingxinxi"}],"menu":"报名信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"行动报告","menuJump":"列表","tableName":"xingdongbaogao"}],"menu":"行动报告管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"业务代办","menuJump":"列表","tableName":"yewudaiban"}],"menu":"业务代办管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"费用缴纳","menuJump":"列表","tableName":"feiyongjiaona"}],"menu":"费用缴纳管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"核算结果","menuJump":"列表","tableName":"hesuanjieguo"}],"menu":"核算结果管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"疫情公告","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","咨询"],"menu":"医疗专家列表","menuJump":"列表","tableName":"yiliaozhuanjia"}],"menu":"医疗专家模块"},{"child":[{"buttons":["查看","报名"],"menu":"志愿者信息列表","menuJump":"列表","tableName":"zhiyuanzhexinxi"}],"menu":"志愿者信息模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","删除"],"menu":"专家咨询","menuJump":"列表","tableName":"zhuanjiazixun"}],"menu":"专家咨询管理"},{"child":[{"buttons":["查看"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"},{"child":[{"buttons":["查看","支付"],"menu":"预约信息","menuJump":"列表","tableName":"yuyuexinxi"}],"menu":"预约信息管理"},{"child":[{"buttons":["查看"],"menu":"健康档案","menuJump":"列表","tableName":"jiankangdangan"}],"menu":"健康档案管理"},{"child":[{"buttons":["查看","删除"],"menu":"报名信息","menuJump":"列表","tableName":"baomingxinxi"}],"menu":"报名信息管理"},{"child":[{"buttons":["新增","查看"],"menu":"行动报告","menuJump":"列表","tableName":"xingdongbaogao"}],"menu":"行动报告管理"},{"child":[{"buttons":["新增","查看","支付"],"menu":"业务代办","menuJump":"列表","tableName":"yewudaiban"}],"menu":"业务代办管理"},{"child":[{"buttons":["查看","支付"],"menu":"费用缴纳","menuJump":"列表","tableName":"feiyongjiaona"}],"menu":"费用缴纳管理"},{"child":[{"buttons":["查看","修改","删除","新增"],"menu":"核算结果","menuJump":"列表","tableName":"hesuanjieguo"}],"menu":"核算结果管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","咨询"],"menu":"医疗专家列表","menuJump":"列表","tableName":"yiliaozhuanjia"}],"menu":"医疗专家模块"},{"child":[{"buttons":["查看","报名"],"menu":"志愿者信息列表","menuJump":"列表","tableName":"zhiyuanzhexinxi"}],"menu":"志愿者信息模块"}],"roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","回复"],"menu":"专家咨询","menuJump":"列表","tableName":"zhuanjiazixun"}],"menu":"专家咨询管理"},{"child":[{"buttons":["查看","删除","修改"],"menu":"咨询回复","menuJump":"列表","tableName":"zixunhuifu"}],"menu":"咨询回复管理"},{"child":[{"buttons":["查看","审核","健康档案"],"menu":"预约信息","menuJump":"列表","tableName":"yuyuexinxi"}],"menu":"预约信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"健康档案","menuJump":"列表","tableName":"jiankangdangan"}],"menu":"健康档案管理"},{"child":[{"buttons":["查看","修改","删除","审核"],"menu":"核算结果","menuJump":"列表","tableName":"hesuanjieguo"}],"menu":"核算结果管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","咨询"],"menu":"医疗专家列表","menuJump":"列表","tableName":"yiliaozhuanjia"}],"menu":"医疗专家模块"},{"child":[{"buttons":["查看","报名"],"menu":"志愿者信息列表","menuJump":"列表","tableName":"zhiyuanzhexinxi"}],"menu":"志愿者信息模块"}],"roleName":"医疗专家","tableName":"yiliaozhuanjia"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
