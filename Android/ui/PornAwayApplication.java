.class public Lorg/pornaway/ui/PornAwayApplication;
.super Landroid/app/Application;
.source "PornAwayApplication.java"


# direct methods
.method public constructor <init>()V
    .registers 1

    .prologue
    .line 30
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .registers 3

    .prologue
    .line 37
    :try_start_0
    const-string v0, "PornAway"

    const-string v1, "Setting workaround for AsyncTask..."

    invoke-static {v0, v1}, Lorg/pornaway/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    const-string v0, "android.os.AsyncTask"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_c} :catch_2c

    .line 43
    :goto_c
    invoke-static {p0}, Lorg/pornaway/helper/PreferenceHelper;->getDebugEnabled(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_24

    .line 44
    const/4 v0, 0x1

    sput-boolean v0, Lorg/pornaway/util/Constants;->DEBUG:Z

    .line 45
    const-string v0, "PornAway"

    const-string v1, "Debug set to true by preference!"

    invoke-static {v0, v1}, Lorg/pornaway/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    sget-boolean v0, Lorg/pornaway/util/Constants;->DEBUG:Z

    sput-boolean v0, Lorg/sufficientlysecure/rootcommands/RootCommands;->DEBUG:Z

    .line 53
    :goto_20
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 54
    return-void

    .line 49
    :cond_24
    const/4 v0, 0x0

    sput-boolean v0, Lorg/pornaway/util/Constants;->DEBUG:Z

    .line 50
    sget-boolean v0, Lorg/pornaway/util/Constants;->DEBUG:Z

    sput-boolean v0, Lorg/sufficientlysecure/rootcommands/RootCommands;->DEBUG:Z

    goto :goto_20

    .line 39
    :catch_2c
    move-exception v0

    goto :goto_c
.end method
