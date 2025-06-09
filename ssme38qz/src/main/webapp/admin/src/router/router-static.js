import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import xingdongbaogao from '@/views/modules/xingdongbaogao/list'
    import zhuanjiazixun from '@/views/modules/zhuanjiazixun/list'
    import jiankangdangan from '@/views/modules/jiankangdangan/list'
    import hesuanjieguo from '@/views/modules/hesuanjieguo/list'
    import zhiyuanzhexinxi from '@/views/modules/zhiyuanzhexinxi/list'
    import yewudaiban from '@/views/modules/yewudaiban/list'
    import yuyuexinxi from '@/views/modules/yuyuexinxi/list'
    import feiyongjiaona from '@/views/modules/feiyongjiaona/list'
    import forum from '@/views/modules/forum/list'
    import yiliaozhuanjia from '@/views/modules/yiliaozhuanjia/list'
    import zixunhuifu from '@/views/modules/zixunhuifu/list'
    import baomingxinxi from '@/views/modules/baomingxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '疫情公告',
        component: news
      }
          ,{
	path: '/xingdongbaogao',
        name: '行动报告',
        component: xingdongbaogao
      }
          ,{
	path: '/zhuanjiazixun',
        name: '专家咨询',
        component: zhuanjiazixun
      }
          ,{
	path: '/jiankangdangan',
        name: '健康档案',
        component: jiankangdangan
      }
          ,{
	path: '/hesuanjieguo',
        name: '核算结果',
        component: hesuanjieguo
      }
          ,{
	path: '/zhiyuanzhexinxi',
        name: '志愿者信息',
        component: zhiyuanzhexinxi
      }
          ,{
	path: '/yewudaiban',
        name: '业务代办',
        component: yewudaiban
      }
          ,{
	path: '/yuyuexinxi',
        name: '预约信息',
        component: yuyuexinxi
      }
          ,{
	path: '/feiyongjiaona',
        name: '费用缴纳',
        component: feiyongjiaona
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/yiliaozhuanjia',
        name: '医疗专家',
        component: yiliaozhuanjia
      }
          ,{
	path: '/zixunhuifu',
        name: '咨询回复',
        component: zixunhuifu
      }
          ,{
	path: '/baomingxinxi',
        name: '报名信息',
        component: baomingxinxi
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
