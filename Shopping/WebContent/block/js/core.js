function addLi(name){
	return $('<li>'+ name+'</li>');
}
function addA(name,href){
	return $('<a href='+href+'>'+ name+'</a>');
}
function addI(name){
	return $('<i>'+ name+'</i>');
}
function addSpan(name){
	return $('<span>'+ name+'</span>');
}
function addUl(name){
	return $('<ul>'+ name+'</ul>');
}

//轮播图开始
function lbt(){
	var index = 0;
//	left按钮
	$('.arr-l').click(function(e){
		var length=$('.page').children().length-1;
//		alert('li数量：'+length);
		if(index==0){
//			如果第一个变红
			
			index=length;
			$('.page li:eq('+index+')').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}else{
			$('.page li:eq('+index+')').removeClass('current');
			index--;
//			alert(index);
			$('.page li:eq('+index+')').addClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}
		
	});
//	right按钮
	$('.arr-r').click(function(e){
		var length=$('.page').children().length-1;
		if(index==length){
//			如果最后一个变红
			index=0;
			$('.page li:first').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}else{
			$('.page li:eq('+index+')').removeClass('current');
			index++;
			$('.page li:eq('+index+')').addClass('current').siblings().removeClass('current');
			$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
		}
	});
	$('.page li').mouseover(function(){
//		alert('12')
		$(this).addClass('current').siblings().removeClass('current');
		index=parseInt($(this).html());
		$('.banner li:eq('+index+')').css('display','block').siblings().css('display','none');
	});
	
}
//轮播图结束
//工具栏生成返回首页开始
function creatback(){
	//	顶部工具栏
	//生成返回首页
	var myTag01=addLi('').append( addA('').append(addI('')).append(addSpan('返回首页')).attr('href','index.html') );
	//登陆 注册修改
	
    $('.w>.fl').prepend(myTag01);
    $('.w>.fl li:first').addClass('backhome');
    $('.backhome+li').css('marginLeft','80px');
}
//工具栏生成返回首页结束
