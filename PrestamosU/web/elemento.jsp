<%-- 
    Document   : elemento
    Created on : 20/06/2018, 09:14:54 AM
    Author     : Juan
--%>

<%@page import="servlets.dependencia"%>
<%@page import="prestamoDTO.Espacio"%>
<%@page import="prestamoDTO.Dependencia"%>
<%@page import="prestamoDTO.Elemento"%>
<%@page import="servlets.espacios"%>
<!DOCTYPE html >
<head>
    <title>UFPS - C�cuta</title>

    <!-- Meta -->


    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

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

<link rel="stylesheet" type="text/css" href="css/default.css" />
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>



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
                                <!--    <ul class="topbar-list topbar-menu">
                                        <li><a href="/universidad/perfiles/estudiantes/953"><i class="fa fa-user"></i> Estudiantes</a></li>
                                        <li><a href="/universidad/perfiles/egresados/954"><i class="fa fa-graduation-cap"></i> Egresados</a></li>
                                        <li><a href="#"><i class="fa fa-user-secret"></i> Docentes</a></li>
                                         <li><a href="#"><i class="fa fa-briefcase"></i> Administrativos</a></li>
            
            
            
                                        <li class="cd-log_reg hidden-sm hidden-md hidden-lg"><strong><a class="cd-signup" href="javascript:void(0);">Lenguaje</a></strong>
                                        <ul class="topbar-dropdown">
                                                <li><a href="#">Ingl�s</a></li>
                                                <li><a href="#">Espa�ol</a></li>
                                            </ul></li>
                                             <li class="cd-log_reg hidden-sm hidden-md hidden-lg"><strong><a class="cd-signin" href="javascript:void(0);"><i class="fa fa-reply"></i> Versi�n Anterior</a></strong></li>
                                    </ul>-->
                            </div>
                            <div class="col-sm-5 col-xs-5 clearfix">
                                <i class="fa fa-institution search-btn pull-right"></i>
                                <ul class="topbar-list topbar-log_reg pull-right visible-sm-block visible-md-block visible-lg-block">
                                    <li class="cd-log_reg home" style="padding: 0px 12px;">
                                        <a href="index.jsp">Salir</a>
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
                <a class="logo logo-responsive" href="index.html">
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

        <a  class= "navbar-brand "  href="#">Inicio</a>

        <!-- Links -->
        <!-- <ul class="navbar-nav">
           <li class="nav-item">
               <a class="nav-link" href="index2.html"><strong><big>Ingresar Como Estudiante</big></strong></a>
           </li>
           <li class="nav-item">
             <a class="nav-link" href="#"><strong><big>Ingresar Como Docente</big></strong></a>
           </li>
             <li class="nav-item">
             <a class="nav-link" href="#"><strong><big>Ingresar Como Externo</big></strong ></a>
           </li>
             
        
         </ul>-->

    </nav>

    <br>

    <div style="width: 20%; float:left;">
        <div id="menu">
            <ul>
                <li><a title="" href="homeAdmin.jsp">Espacios</a></li>
                <li><a title="" href="">Elementos</a></li>
                <li><a title="" href="">Eventos</a></li>
                <li><a title="" href="dependencia.jsp">Dependencia</a></li>
             </ul>

        </div>

    </div>

    <%
        dependencia d = new dependencia();
    %>

    <div class="container">
        <form action="dependencia?action=registrar" method="post">
            <div class="row">
                <div class="col-6">
                    <div class="form-group">
                        <label for="documento">Id</label>
                        <input type="text" class="form-control" id="id" placeholder="Id" name="id">
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre</label>
                        <input type="text" class="form-control" id="nombre" placeholder="Nombre" name="nombre">
                    </div>
                    <div class="form-group">
                        <label for="email">Correo</label>
                        <input type="email" class="form-control" id="correo" placeholder="Correo" name="correo">
                    </div>
                    
                   
                    
                </div>
                <div class="col-6">
                 <div class="form-group">
                        <label for="telefono">Telefono</label>
                        <input type="number" class="form-control" id="correo" placeholder="Telefono" name="telefono">
                    </div>
                    
                    <div class="form-group">
                        <label for="ubicacion">Ubicacion</label>
                        <input type="text" class="form-control" id="correo" placeholder="Ubicacion" name="ubicacion">
                    </div>
                </div>
                <div class="col-4 offset-4">
                    <input type="submit" style="width: 100%;" value="registrar" class="btn btnf btn-primary">
                </div>
            </div> 
        </form>


        <div class="row mt-5">
            <div class="col-12">
                <table class="table table-bordered">
                    <thead>
                        <tr>
                            <th>
                                Id
                            </th>
                            <th>
                                Nombre
                            </th>
                            <th>
                                Correo
                            </th>                   
                            <th>
                                Telefono
                            </th>                   
                            <th>
                                Ubicacion
                            </th>                   
                            <th>
                                Acciones
                            </th>                   
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Dependencia dep :d.listarDependencias() ) {


                        %>

                        <tr>
                            <td>
                                <%=dep.getId_dependencia()%>
                            </td>
                            <td>
                                <%=dep.getNombre()%>
                            </td>
                            <td>
                                <%=dep.getCorreo()%>
                            </td>
                            <td>
                                <%=dep.getTelefono()%>
                            </td>
                            <td>
                                <%=dep.getUbicacion()%>
                            </td>
                            <td>
                                <a href="dependencia?action=delete&id=<%=dep.getId_dependencia()%>" class="btn btn-danger">Eliminar</a>
                                <button type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal<%=dep.getId_dependencia()%>">Actualizar</button>

                                <!-- Modal -->
                                <div id="myModal<%=dep.getId_dependencia()%>" class="modal fade" role="dialog">
                                    <div class="modal-dialog">

                                        <!-- Modal content-->
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                <h4 class="modal-title"></h4>
                                            </div>
                                            <div class="modal-body">
                                                <p>Editar el Registro <%=dep.getId_dependencia()%></p>

                                                <form action="dependencia?action=actualizar" method="post">
                                                    <div class="row">
                                                        <div class="col-6">
                                                            <div class="form-group">
                                                                <label for="id">Id</label>
                                                                <input type="text" value="<%=dep.getId_dependencia()%>" class="form-control" id="id" placeholder="Id" name="id" readonly="">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="nombre">Nombre</label>
                                                                <input type="text" value="<%=dep.getNombre()%>" class="form-control" id="nombre" placeholder="Nombre" name="nombre">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="email">Correo</label>
                                                                <input type="email" value="<%=dep.getCorreo()%>" class="form-control" id="dimencion" placeholder="Correo" name="correo">
                                                            </div>
                                                            
                                                        </div>
                                                        <div class="col-6">
                                                            
                                                            <div class="form-group">
                                                                <label for="text">Telefono</label>
                                                                <input type="number" value="<%=dep.getTelefono()%>" class="form-control" id="dimencion" placeholder="Telefono" name="telefono">
                                                               
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="ubicacion">Ubicacion</label>
                                                                <input type="text" value="<%=dep.getUbicacion()%>" class="form-control" id="capacidad" placeholder="Ubicacion" name="ubicacion">
                                                            </div>
                                                            
                                                         
                                                        </div>
                                                        <div class="col-4 offset-4">
                                                            <input type="submit" style="width: 100%;" value="actualizar" class="btn btnf btn-primary">
                                                        </div>
                                                    </div> 
                                                </form>


                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            </div>
                                        </div>

                                    </div>
                                </div>
                            </td>
                            <%}%>

                        </tr>
                    </tbody>

                </table>
            </div>
        </div>


        <br>

    </div>

    <div class="cuadroredes">
        <ul class="social-icons social-icons-color margin-top-10">
            <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="S�guenos en Facebook"><a href="https://www.facebook.com/UFPS-C%C3%BAcuta-553833261409690" class="rounded social_facebook"></a>
            </li>
            <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="S�guenos en Twitter"><a href="https://twitter.com/UFPSCUCUTA" class="rounded social_twitter"></a></li>
            <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="S�guenos en Youtube"><a href="https://www.youtube.com/channel/UCgPz-qqaAk4lbHfr0XH3k2g" class="rounded social_youtube"></a></li>
            <li class="tooltips" data-toggle="tooltip" data-placement="bottom" data-original-title="S�guenos en Instagram">
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
                        <a href="index.html"><img id="logo-footer" class="img-responsive" src="img/logoufpsvertical.png" alt="Logo Pie de P�gina"></a>
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
                    <div class="headline" style="border-bottom: #272727;"><h2>Enlaces de Inter�s</h2></div>
                    <ul class="list-unstyled latest-list">
                        <li><a href="#" style="text-transform: none;">Proceso de selecci�n</a></li>
                        <li><a href="#" style="text-transform: none;">Convocatoria</a></li>
                        <li><a href="#" style="text-transform: none;">Calendarios</a></li>
                        <li><a href="#" style="text-transform: none;">Proceso democr�tico 2015</a></li>
                        <li><a href="#" style="text-transform: none;">Derechos pecuniarios </a></li>
                    </ul>
                </div><!--/col-md-3-->
                <!-- End Link List -->

                <!-- Address -->
                <div class="col-md-3 col-sm-4  map-img md-margin-bottom-40">
                    <div class="headline" style="border-bottom: #272727;"><h2>Contactos</h2></div>
                    <address class="md-margin-bottom-40">
                        Avenida Gran Colombia No. 12E-96 Barrio Colsag, <br>
                        San Jos� de C�cuta - Colombia <br>
                        Tel�fono (057)(7) 5776655 <br>
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
                        2016 � All Rights Reserved.
                        Desarrollado por: <a href="#">VAVM - Divisi�n de Sistemas</a>
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


<div class="owl-clients-v1" style="background-color:#EEE; padding: 5px;">
    <div class="item">
        <a href="http://www.mineducacion.gov.co/"><img src="img/mineducacion.png"class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.contraloriagen.gov.co/"><img src="img/contraloria.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.procuraduria.gov.co/"><img src="img/procuraduriageneraldelanacion.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.gobiernoenlinea.gov.co/"><img src="img/gobiernoenlinea.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.urnadecristal.gov.co/"><img src="img/urnadecristal.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.icfes.gov.co/"><img src="img/icfes.png"class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.icetex.gov.co/"><img src="img/icetex.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.universia.net.co/"><img src="img/universia.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.colombiaaprende.edu.co/"><img src="img/colombiaaprende.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.renata.edu.co/"><img src="img/renata-logo.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.colciencias.gov.co/"><img src="img/COLCIENCIAS.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.cna.gov.co/"><img src="img/cna.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.mineducacion.gov.co/sistemasdeinformacion/1735/propertyvalue-41698.html"><img src="img/SACES.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.mineducacion.gov.co/sistemasdeinformacion/1735/w3-propertyname-2672.html"><img src="img/SNIES.png" class="hover-shadow" alt=""></a>
    </div>
    <div class="item">
        <a href="http://www.mineducacion.gov.co/sistemasdeinformacion/1735/w3-propertyname-2895.html"><img src="img/SPADIES.png" class="hover-shadow" alt=""></a>
    </div>


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

</body>

</html>
