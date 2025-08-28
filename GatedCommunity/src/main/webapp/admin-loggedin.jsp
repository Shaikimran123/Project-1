<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Dashboard - Gated Community</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background: url('https://in.images.search.yahoo.com/images/view;_ylt=AwrKGQpMDrBoQksLUGG9HAx.;_ylu=c2VjA3NyBHNsawNpbWcEb2lkA2ViMmY5MTdlMTNiZTQ1ZDdmYTcyYmI1MGQwNTViYTk1BGdwb3MDNjMEaXQDYmluZw--?back=https%3A%2F%2Fin.images.search.yahoo.com%2Fsearch%2Fimages%3Fp%3Dgated%2Bcommunity%2Bcomplain%2Bsite%2Bimaheg%2Bfor%2Bbackground%26ei%3DUTF-8%26fr%3Dmcafee_e-27930_3pc-cs%26fr2%3Dp%253As%252Cv%253Ai%252Cm%253Asb-top%26nost%3D1%26tab%3Dorganic%26ri%3D63&w=970&h=808&imgurl=freerangestock.com%2Fsample%2F91294%2Fcomplaints-folder-shows-frustrated-administration-and-criticism-.jpg&rurl=https%3A%2F%2Ffreerangestock.com%2Fphotos%2F91708%2Fcomplaints-folder-shows-frustrated-administration-and-criticism-.html&size=39KB&p=gated+community+complain+site+imaheg+for+background&oid=eb2f917e13be45d7fa72bb50d055ba95&fr2=p%3As%2Cv%3Ai%2Cm%3Asb-top&fr=mcafee_e-27930_3pc-cs&tt=Free+Stock+Photo+of+Complaints+Folder+Shows+Frustrated+Administration+...&b=61&ni=90&no=63&ts=&tab=organic&sigr=FmaGAGC_nY.Q&sigb=582tG9UcTUge&sigi=mM3BmEP_ekzl&sigt=29_hqdfs4pQ5&.crumb=HUvOAd5CUnp&fr=mcafee_e-27930_3pc-cs&fr2=p%3As%2Cv%3Ai%2Cm%3Asb-top') no-repeat center center fixed;
            background-size: cover;
        }

        .container {
            padding: 60px;
            background-color: rgba(255, 255, 255, 0.85); /* Light transparent overlay */
            margin: 60px auto;
            width: 80%;
            text-align: center;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.3);
        }

        h2 {
            font-size: 28px;
            color: #333;
        }
    </style>
</head>
<body>

    <%@ include file="AdminNavBar.jsp" %>

    <!-- Welcome Message -->
    <div class="container">
        <h2>Welcome to the Gated Community, <%= session.getAttribute("adminName") %>!</h2>
    </div>

</body>
</html>
