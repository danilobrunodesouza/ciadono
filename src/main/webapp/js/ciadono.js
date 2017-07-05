/* 
 * Definição das funções específicas das aplicação CIADONO
 * Utilizado o jQuery como base
 * 
 */

jQuery.CIADONO = {
  // Função padrão utilizada para exibição de mensagens
  MessageBox: function() {
    var show = function() {
      //alert(1234);
      $("#wrapper").load('/ciadono/app/main');
    };
    var hide = function() {
      // something...
    };
    return {
      show: show,
      hide: hide
    };
  },
  /*
  AppCtrl: function(){},
  exec: function(callback){
	  if (callback) {
		  callback;
	  }
  },*/
  loadContent: function (url,activeID,callback) {
	  $("#wrapper").load(url, function() {		  
		 $("li").removeClass("active");
		 $("#"+activeID).addClass("active");
		  
		  if (callback) {
			  callback();
		  }
	  });
  },
  logoffService: function(url, callback){	  
	 location='/ciadono/app/logoff';
  },
	  
  autenticaUsuario: function (username, password, callback) {
	  $.post( "/ciadono/app/login", { "login": username, "password": password }, function( data ) {
		  console.log("Dados: " + data.result);
		  if (data.result == "OK") {
			  console.log("Callback= "+ callback);
			  if (callback) {
				  window.location.href = '/ciadono/app/main';
				  console.log("Callback: ");
				  callback();
			  }			  
		  } else {
			  alert(data.result);
		  }
	  }, "json");	  	  
  }
};

// Função para acessar o DOM
$.fn.greenify = function() {
    this.css( "color", "green" );
};