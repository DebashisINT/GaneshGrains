package com.breezefieldganeshgrains.app

import android.app.Activity
import android.content.Context
import android.os.StrictMode
import androidx.appcompat.app.AlertDialog
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.breezefieldganeshgrains.R
import com.breezefieldganeshgrains.app.utils.FileLoggingTree
import com.crashlytics.android.Crashlytics
import com.facebook.stetho.Stetho
import com.marcinmoskala.kotlinpreferences.PreferenceHolder
import io.fabric.sdk.android.Fabric
import timber.log.Timber


class FTSApp : MultiDexApplication() {

    lateinit var appComponent: AppComponent

    @Suppress("INTEGER_OVERFLOW")
    private val MAX_TIME: Long = 1000 * 60 * 60 * 24 * 300

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()

       /* // Initialize ACRA with custom ReportSenderFactory
        ACRA.init(
            this,
            CoreConfigurationBuilder(this)
                .withBuildConfigClass(BuildConfig::class.java)
                .withReportFormat(StringFormat.JSON)
                .withPluginConfigurations(
                    DialogConfigurationBuilder(this)
                        .withTitle(getString(R.string.acra_dialog_title)) // Title of the dialog
                        .withText(CrashReportData) // Message to show in the dialog
                        .withPositiveButtonText(getString(R.string.acra_dialog_positive_button)) // Text for the positive button
                        .withNegativeButtonText(getString(R.string.acra_dialog_negative_button)) // Text for the negative button
                        .build()
                ).se(CrashReasonReportSenderFactory())
        )
        ACRA.errorReporter.reportScheduler*/

        // Initialize other components
        AppDatabase.initAppDatabase(this)
        Stetho.initializeWithDefaults(this)
        val builder = StrictMode.VmPolicy.Builder()
        StrictMode.setVmPolicy(builder.build())
        PreferenceHolder.setContext(applicationContext)
        Fabric.with(this, Crashlytics())

        // Initialize Timber or other logging frameworks if needed
        initTimber()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
        Timber.plant(FileLoggingTree())
    }

   /* // Custom Report Sender for ACRA
    class CrashReasonReportSender : ReportSender {
        override fun send(context: Context, report: CrashReportData) {
            // Ensure the context is an Activity context
            if (context is Activity) {
                val crashReason = report.getPropertyString("EXCEPTION_MESSAGE") ?: "Unknown error occurred."
                val stackTrace = report.getPropertyString("STACK_TRACE") ?: "No stack trace available."

                val dynamicMessage = """
                The application crashed due to the following reason:
                $crashReason
                
                Stack Trace:
                $stackTrace
            """.trimIndent()

                showDialog(context, dynamicMessage)
            }
        }

        private fun showDialog(activity: Activity, message: String) {
            AlertDialog.Builder(activity)
                .setTitle("Application Crash")
                .setMessage(message)
                .setPositiveButton("Send Report") { dialog, _ ->
                    dialog.dismiss()
                    // Logic to send the report can be added here
                }
                .setNegativeButton("Cancel") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }

    // Factory for the custom report sender
    class CrashReasonReportSenderFactory  : ReportSenderFactory {
        override fun create(context: Context, config: org.acra.config.CoreConfiguration): ReportSender {
            return CrashReasonReportSender()
        }
    }*/
}