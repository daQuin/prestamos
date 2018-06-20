<%-- 
    Document   : login
    Created on : 14/06/2018, 06:35:23 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html >
 <head>
        <title>UFPS - Cúcuta</title>

        <!-- Meta -->
        
         
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
      <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
			<!-- vinculo a bootstrap -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Temas-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- se vincula al hoja de estilo para definir el aspecto del formulario de login-->  
<link rel="stylesheet" type="text/css" href="estilo.css">
        
         <meta name="description" content="">
        <meta name="author" content="">
        
      

</head>

       
       
       
 
        <!-- Favicon -->
        <link href="img/favicon.ico" rel="Shortcut icon">

        <!-- Web Fonts -->
        <link rel='stylesheet' type='text/css' href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'> 

        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/ie8.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/blocks.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/plugins.min.css">
        <link type="text/css" rel="stylesheet" href="css/style.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/app.min.css">
        <link type="text/css" rel="stylesheet" href="css/shop.plugins.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/shop.blocks.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/style-switcher.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/shop.style.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/header-v6.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/header-v8.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/header.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/footer-v1.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/animate.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/line-icons.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/font-awesome.min.css">
        <link type="text/css" rel="stylesheet" href="css/owl.carousel.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/horizontal-parallax.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/layerslider.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/ured.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/sky-forms.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/custom-sky-forms.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/profile.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/brand-buttons.min.css">
        <link type="text/css" rel="stylesheet" href="css/brand-buttons-inversed.min.css">
        
        <link type="text/css" rel="stylesheet" href="css/hover.min.css">
        <link type="text/css" rel="stylesheet" href="css/custom-hover-effects.min.css">
        <link type="text/css" rel="stylesheet" href="css/custom.min.css">
        <link type="text/css" rel="stylesheet" href="css/pgwslider.min.css">
       
       
  
 
 </head>
    <body class="header-fixed boxed-layout" style="position: relative; min-height: 100%; top: 0px;">
        <div class="wrapper">
            <!--=== Header v6 ===-->
<div id="menu-principal" class="header-v6 header-white-transparent header-sticky" style="position: relative;">
    <div id="barra-superior" class="header-v8">
        <!-- Topbar blog -->
        <div class="blog-topbar">
            <div class="topbar-search-block">
                <div class="container">
                    <form action="">
                        <input type="text" class="form-control" placeholder="Buscar...">
                        <div class="search-close"><i class="icon-close"></i></div>
                    </form>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-sm-7 col-xs-7">

                        <div class="topbar-toggler" style="font-size: 10px; color: #eee; letter-spacing: 1px; text-transform: uppercase;"><span class="fa fa-angle-down"></span> PERFILES</div>
                        <ul class="topbar-list topbar-menu">
                            <li><a href="/universidad/perfiles/estudiantes/953"><i class="fa fa-user"></i> Estudiantes</a></li>
                            <li><a href="/universidad/perfiles/egresados/954"><i class="fa fa-graduation-cap"></i> Egresados</a></li>
                            <li><a href="#"><i class="fa fa-user-secret"></i> Docentes</a></li>
                             <li><a href="#"><i class="fa fa-briefcase"></i> Administrativos</a></li>



                            <li class="cd-log_reg hidden-sm hidden-md hidden-lg"><strong><a class="cd-signup" href="javascript:void(0);">Lenguaje</a></strong>
                            <ul class="topbar-dropdown">
                                    <li><a href="#">Inglés</a></li>
                                    <li><a href="#">Español</a></li>
                                </ul></li>
                                 <li class="cd-log_reg hidden-sm hidden-md hidden-lg"><strong><a class="cd-signin" href="javascript:void(0);"><i class="fa fa-reply"></i> Versión Anterior</a></strong></li>
                        </ul>
                    </div>
                    <div class="col-sm-5 col-xs-5 clearfix">
                        <i class="fa fa-search search-btn pull-right"></i>
                        <ul class="topbar-list topbar-log_reg pull-right visible-sm-block visible-md-block visible-lg-block">
                             <li class="cd-log_reg home" style="padding: 0px 12px;">
                                 <div id="google_translate_element"></div><script type="text/javascript">
                                     function googleTranslateElementInit() {
                                         new google.translate.TranslateElement({pageLanguage: 'es', includedLanguages: 'en,fr,it', layout: google.translate.TranslateElement.InlineLayout.SIMPLE, autoDisplay: false}, 'google_translate_element');
                                     }
                                 </script><script type="text/javascript" src="//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>

                             </li>

                             
                        </ul>
                    </div>
                </div><!--/end row-->
            </div><!--/end container-->
        </div>
        <!-- End Topbar blog -->

    </div>


    <div class="header-v8 img-logo-superior" style="background-color: #aa1916;">

        <!--=== Parallax Quote ===-->
        <div class="parallax-quote parallaxBg" style="padding: 30px 30px;">
         
                <div class="parallax-quote-in" style="padding: 0px;">
                    <div class="row">
                        <div class="col-md-4 col-sm-4 col-xs-5">
                            <a href="#">
                                <img id="logo-header"
                                     src="img/logo_ufps.png" alt="Logo UFPS">
                            </a>
                        </div>
                        <div class="col-md-2 col-ms-1 col-xs-2 pull-right">
                            <a href="http://www.colombia.co/"><img class="header-banner"
                                                                   src="img/escudo_colombia.png"
                                                                   alt="Escudo de Colombia"></a>
                        </div>
                    </div>
                </div>
        </div>
        <!--=== End Parallax Quote ===-->


    </div><!--/end header-v8-->


    <div class="menu-responsive">
        <!-- Logo -->
        <a class="logo logo-responsive" href="index.jsp">
            <img src="img/horizontal_logo_pequeno.png" alt="Logo">
        </a>  
        <!-- End Logo -->
        
 <!-- Toggle get grouped for better mobile display -->
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="fa fa-bars"></span>
        </button>
        <!-- End Toggle -->
    </div>

     
        
        
            </div>
        </div>
        
  <!-- Brand/logo -->
 <div class="container">

  
</div>


  <!-- Brand -->
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">

            <a  class= "navbar-brand "  href="index.jsp">Inicio</a>

  <!-- Links -->
  
</nav>
         
<br>
  
<div class="container">
 
  <li class="cd-log_reg home">
                               <center> <a href="logine.html"><i class="" aria-hidden="true"></i><h1>INICIAR SESION</h1></a></center>
      <center> <a href="logine.html"><i class="" aria-hidden="true"></i><h4>PERSONA INTERNA</h4></a></center>
                            </li>
</div>
      
      
      <div id="Contenedor">
		 <div class="Icon">
                    <!--Icono de usuario-->
                   <span class="glyphicon glyphicon-user"></span>
                 </div>
<div class="ContentForm">
		 	<form action="usuario?action=login" method="post">
		 		<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="fa fa-user-circle" aria-hidden="true"></i></i></span>
				  <input type="num" class="form-control" name="cedula" placeholder="Usuario" id="Usuario" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				<div class="input-group input-group-lg">
				  <span class="input-group-addon" id="sizing-addon1"><i class="glyphicon glyphicon-lock"></i></span>
				  <input type="password" name="pass" class="form-control" placeholder="******" aria-describedby="sizing-addon1" required>
				</div>
				<br>
				<button class="btn btn-lg btn-primary btn-block btn-signin" id="IngresoLog" type="submit">Entrar</button>
				<div class="opcioncontra"><a href="#">Olvidaste tu contraseña?</a></div>
		 	</form>
		 </div>	
		 

        
        <div class="cuadroredes">
    <ul class="social-icons social-icons-color margin-top-10">
        <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="Síguenos en Facebook"><a href="https://www.facebook.com/UFPS-C%C3%BAcuta-553833261409690" class="rounded social_facebook"></a>
        </li>
        <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="Síguenos en Twitter"><a href="https://twitter.com/UFPSCUCUTA" class="rounded social_twitter"></a></li>
        <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="Síguenos en Youtube"><a href="https://www.youtube.com/channel/UCgPz-qqaAk4lbHfr0XH3k2g" class="rounded social_youtube"></a></li>
        <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="Síguenos en Instagram">
            <a href="https://www.instagram.com/ufpscucuta/" class="rounded social_instagram"></a></li>
        <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="Escuchanos en Vivo"><a href="#" class="rounded social_emisora"></a></li>
    </ul>
</div>
<!-- FIN ICONOS REDES SOCIALES -->

<!-- End Content Part -->
                    </div><!--/wrapper-->
        <!--=== Footer Version 1 ===-->
        <!-- organismos de control -->
<div class="footer-v1 off-container">
    <div class="footer">
        <div class="container">
            <div class="row">
                <!-- About -->
                <div class="col-md-3 col-sm-4 md-margin-bottom-40">
                    <div class="footer-main">
                        <a href="index.html"><img id="logo-footer" class="img-responsive" src="img/logoufpsvertical.png" alt="Logo Pie de Página"></a>
                    </div>
                </div><!--/col-md-3-->
                <!-- End About -->

                <!-- Latest -->
                <div class="col-md-3 col-sm-4 md-margin-bottom-40">
                    <div class="posts">
                        <div class="headline" style="border-bottom: #272727;"><h2>Aplicaciones</h2></div>
                        <ul class="list-unstyled latest-list">
                            <li>
                                <a href="#">Divisist</a>
                            </li>
                            <li>
                                <a href="#">Piagev</a>
                            </li>
                            <li>
                                <a href="#">PDQRS</a>
                            </li>
                              <li>
                                <a href="#">DatarSoft</a>
                            </li>
                        </ul>
                    </div>
                </div><!--/col-md-3-->
                <!-- End Latest -->

                <!-- Link List -->
                <div class="col-md-3 col-sm-4  md-margin-bottom-40">
                    <div class="headline" style="border-bottom: #272727;"><h2>Enlaces de Interés</h2></div>
                    <ul class="list-unstyled latest-list">
                        <li><a href="#" style="text-transform: none;">Proceso de selección</a></li>
                        <li><a href="#" style="text-transform: none;">Convocatoria</a></li>
                        <li><a href="#" style="text-transform: none;">Calendarios</a></li>
                        <li><a href="#" style="text-transform: none;">Proceso democrático 2015</a></li>
                        <li><a href="#" style="text-transform: none;">Derechos pecuniarios </a></li>
                    </ul>
                </div><!--/col-md-3-->
                <!-- End Link List -->

                <!-- Address -->
                <div class="col-md-3 col-sm-4  map-img md-margin-bottom-40">
                    <div class="headline" style="border-bottom: #272727;"><h2>Contactos</h2></div>
                    <address class="md-margin-bottom-40">
                        Avenida Gran Colombia No. 12E-96 Barrio Colsag, <br>
                        San José de Cúcuta - Colombia <br>
                        Teléfono (057)(7) 5776655 <br>
                        Correo: <a href="mailto:oficinadeprensa@ufps.edu.co" class="">oficinadeprensa@ufps.edu.co</a>
                    </address>
                </div><!--/col-md-3-->
                <!-- End Address -->
            </div>
        </div>
    </div><!--/footer-->

    <div class="copyright">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <p>
                        2016 © All Rights Reserved.
                         Desarrollado por: <a href="#">VAVM - División de Sistemas</a>
                    </p>
                </div>

                <!-- Social Links -->
                <div class="col-md-4">  
                    <ul class="list-inline dark-social pull-right space-bottom-0">
                            <li>
                                <a data-placement="top" data-toggle="tooltip" class="tooltips" data-original-title="Facebook" href="https://www.facebook.com/UFPS-C%C3%BAcuta-553833261409690">
                                    <i class="fa fa-facebook"></i>
                                </a>
                            </li>
                            <li>
                                <a data-placement="top" data-toggle="tooltip" class="tooltips" data-original-title="Twitter" href="https://twitter.com/UFPSCUCUTA">
                                    <i class="fa fa-twitter"></i>
                                </a>
                            </li>
                            <li>
                                <a data-placement="top" data-toggle="tooltip" class="tooltips" data-original-title="Instagram" href="https://www.instagram.com/ufpscucuta/">
                                    <i class="fa fa-instagram"></i>
                                </a>
                            </li>
                            <li>
                                <a data-placement="top" data-toggle="tooltip" class="tooltips" data-original-title="Youtube" href="#">
                                    <i class="fa fa-youtube"></i>
                                </a>
                            </li>
                            <li>
                                <a data-placement="top" data-toggle="tooltip" class="tooltips" data-original-title="Correo" href="#">
                                    <i class="fa fa-envelope-o"></i>
                                </a>
                            </li>
                        </ul>
                </div>
                <!-- End Social Links -->
            </div>
        </div>
    </div><!--/copyright-->
</div>



     

        
       <!--=== End Footer Version 1 ===-->
          <script type="text/javascript" src="js/jquery.min.js"></script>
        
		<script type="text/javascript" src="js/jquery-migrate.min.js"></script>
        
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
        
		<script type="text/javascript" src="js/pgwslider.min.js"></script>
        
		<script type="text/javascript" src="js/back-to-top.min.js"></script>
        
		<script type="text/javascript" src="js/smoothScroll.min.js"></script>
        
		<script type="text/javascript" src="js/owl.carousel.min.js"></script>
        
		<script type="text/javascript" src="js/sequence.jquery-min.js"></script>
        
		<script type="text/javascript" src="js/greensock.js"></script>
        
        <script type="text/javascript" src="js/layerslider.transitions.js"></script>
        
        <script type="text/javascript" src="js/layerslider.kreaturamedia.jquery.js"></script>
        
		<script type="text/javascript" src="js/custom.min.js"></script>
        
		<script type="text/javascript" src="js/app.min.js"></script>
        
		<script type="text/javascript" src="js/owl-carousel.min.js"></script>
        
		<script type="text/javascript" src="js/datepicker.min.js"></script>
        
		<script type="text/javascript" src="js/validation.min.js"></script>
        
		<script type="text/javascript" src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        
		<script type="text/javascript" src="js/owl-recent-works.min.js"></script>
        
		<script type="text/javascript" src="js/wow.min.js"></script>     
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
 <!-- Libreria java scritp de bootstrap -->
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
   
    </body>

    
</html>