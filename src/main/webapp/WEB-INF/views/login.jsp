
<!DOCTYPE html>
<html lang="pt-br">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="generator" content="Bootply" />
    
    <title>CiaDoNó</title>

    <link href="/ciadono/css/bootstrap.min.css" rel="stylesheet">
    <link href="/ciadono/css/styles.css" rel="stylesheet">
    
  </head>
  <body>
	<!--login modal-->
	<div id="loginModal" class="modal show" tabindex="-1" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog">
			<div>
				<div class="modal-header">
					<img src="/ciadono/img/digital.png" class="img-responsive" id="loginImg">
					<img src="/ciadono/img/logo.png" class="img-responsive" id="loginImg">
				</div>
				<div class="modal-body">
					<div class="col-xs-7" id= "positionLogin">
						<div class="form-group">
							<input type="text" class="form-control input-lg" placeholder="Usuário" id="login">
						</div>
						<div class="form-group">
							<input type="password" class="form-control input-lg" placeholder="Senha" id="password">
						</div>
						<div class="form-group">
							<button class="btn btn-primary btn-lg btn-block" id="buttonLogin">Entrar</button>
							<div>${mensagemErro}</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

    <script src="/ciadono/js/jquery-1.11.3.min.js"></script>
    <script src="/ciadono/js/bootstrap.min.js"></script>
    <script src="/ciadono/js/ciadono.js"></script>
    <script src="/ciadono/app/controller"></script>   
	<script>
	$( document ).ready(function() {
		$("#buttonLogin").click(function(){
			var u = $("input[id='login']").val();
			var p = $("input[id='password']").val();
			console.log("User: " + u +" " + "Senha: " + p);
			$.ciadono.autenticaUsuario(u, p, function(){
				location= '/ciadono/app/main';			
			});
		});
	});	
	</script>    
  </body>
</html>