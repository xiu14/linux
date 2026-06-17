package com.ss.android.socialbase.downloader.setting;

/* loaded from: classes2.dex */
public interface DownloadSettingKeys {
    public static final String ACTIVE_LOAD_DOWNLOAD_CACHE = "active_load_download_cache";
    public static final String AUTO_RESUME = "auto_resume";
    public static final String BIZ_CLOSE_DB_BATCH_INIT = "biz_close_db_batch_init";
    public static final String BUG_FIX = "bugfix";
    public static final String CANCEL_WITH_NET_OPT = "cancel_with_net_opt";
    public static final String CONNECT_TIMEOUT = "connect_timeout";
    public static final String DEBUG = "debug";
    public static final String DEFAULT_SAVE_DIR_NAME = "default_save_dir_name";
    public static final String DELAY_INIT_DOWNLOAD_CACHE_MS = "delay_init_download_cache_ms";
    public static final String DELAY_REFRESH_UNSUCCESS_TASK_MS = "delay_refresh_unsuccess_task_ms";
    public static final String DISABLED_TASK_KEYS = "disabled_task_keys";
    public static final String DISABLE_CHECK_NO_NETWORK = "disable_check_no_network";
    public static final String DISABLE_TASK_SETTING = "disable_task_setting";
    public static final String DNS_EXPIRE_MIN = "dns_expire_min";
    public static final String DOWNLOAD_FAILED_CHECK_NET = "download_failed_check_net";
    public static final String DOWNLOAD_FINISH_CHECK_TTMD5 = "download_finish_check_ttmd5";
    public static final String DOWNLOAD_SERVICE_FOREGROUND = "download_service_foreground";
    public static final String DOWNLOAD_WHEN_SPACE_NEGATIVE = "download_when_space_negative";
    public static final String ENABLE_DOWNLOAD_NETWORK_TAG = "enable_download_network_tag";
    public static final String ENABLE_TTNET_TNC_AB_TEST = "enable_ttnet_tnc_ab_test";
    public static final String ENABLE_TTNET_TNC_SETTING = "enable_ttnet_tnc_setting";
    public static final String FILE_PROVIDER_AUTHORITY = "file_provider_authority";
    public static final String FIX_ANR_ISOLATE_ENGINE_AND_CACHE = "fix_anr_isolate_engine_and_cache";
    public static final String FIX_ANR_PROGRESS_HANDLE_MSG = "fix_anr_progress_handle_msg";
    public static final String FIX_ANR_REMOVE_REPORT_IDLE_STATUS = "fix_anr_remove_report_idle_status";
    public static final String FIX_SAME_TASK_MONITOR_REPORT = "fix_same_task_monitor_report";
    public static final String FLUSH_BUFFER_SIZE_BYTE = "flush_buffer_size_byte";
    public static final String FORCE_CHECK_FILE_LENGTH = "force_check_file_length";
    public static final String FORCE_INDEPENDENT_PROCESS = "force_independent_process";
    public static final String IO_TIMEOUT = "io_timeout";
    public static final String KEY_AH_PLANS = "ah_plans";
    public static final String KEY_ANTI_HIJACK_DIR = "download_dir";
    public static final String KEY_APP_INSTALL_RETURN_RESULT = "app_install_return_result";
    public static final String KEY_EXCEPTION_MSG_LENGTH = "exception_msg_length";
    public static final String KEY_HOT_CACHE_KEYS = "lru_preload_hot_cache_keys";
    public static final String KEY_IS_CHECK_CACHE_ENABLE = "is_check_cache_enable";
    public static final String KEY_LRU_CAPACITY_MAX = "lru_download_info_capacity_max";
    public static final String KEY_LRU_DOWNLOAD_INFO_CACHE_ENABLE = "lru_download_info_cache_enable";
    public static final String KEY_SET_NOTIFICATION_GROUP = "set_notification_group";
    public static final String LOAD_DB_WAIT_TIME_MS = "load_db_wait_time_ms";
    public static final String MAIN_THREAD_DB_OP_MAX_TIME_MS = "main_thread_db_op_max_time_ms";
    public static final String MONITOR_DOWNLOAD_CONNECT = "monitor_download_connect";
    public static final String MONITOR_DOWNLOAD_IO = "monitor_download_io";
    public static final String MONITOR_RW = "monitor_rw";
    public static final String MONITOR_SEGMENT_IO = "monitor_segment_io";
    public static final String MONITOR_SLA = "monitor_sla";
    public static final String NETWORK_FAILOVER_STRATEGY = "network_failover_strategy";
    public static final String NET_LIB_STRATEGY = "net_lib_strategy";
    public static final String NOTIFICATION_TEXT_OPT = "notification_text_opt";
    public static final String NOTIFICATION_TIME_WINDOW = "notification_time_window";
    public static final String NO_NET_OPT = "no_net_opt";
    public static final String OPT_MKDIR_FAILED = "opt_mkdir_failed";
    public static final String OPT_NOTIFICATION_UI = "enable_notification_ui";
    public static final String PCDN_CONFIG = "pcdn_config";
    public static final String REMOVE_DOWNLOAD_SUCCESS_AND_NOT_EXISTS = "remove_download_success_and_not_exists";
    public static final String REPORT_SPACE_GRAIN_SIZE = "report_space_grain_size";
    public static final String RETRY_SCHEDULE = "retry_schedule";
    public static final String RETRY_SCHEDULE_CONFIG = "retry_schedule_config";
    public static final String RETRY_STRATEGY = "retry_strategy";
    public static final String SEGMENT_CONFIG = "segment_config";
    public static final String SETTING_TAG = "setting_tag";
    public static final String SINGLE_ASYNC_HANDLE_OPERATION = "single_async_handle_operation";
    public static final String SPACE_FILL_MIN_KEEP_MB = "space_fill_min_keep_mb";
    public static final String SPACE_FILL_PART_DOWNLOAD = "space_fill_part_download";
    public static final String SQL_DOWNLOAD_CACHE_INIT_SINGLE_LOAD_COUNT_LIMIT = "sql_download_cache_init_single_load_count_limit";
    public static final String SQL_DOWNLOAD_CACHE_INIT_SINGLE_LOAD_SLEEP_TIME_MS = "sql_download_cache_init_single_load_sleep_time_ms";
    public static final String SQL_DOWNLOAD_CACHE_TIME_OPT = "sql_download_cache_time_opt";
    public static final String SUPPORT_SQLITE_DOWNGRADE = "support_sqlite_downgrade";
    public static final String SYNC_INTERVAL_MS_BG = "sync_interval_ms_bg";
    public static final String SYNC_INTERVAL_MS_FG = "sync_interval_ms_fg";
    public static final String SYNC_MIN_LENGTH = "sync_min_length";
    public static final String SYNC_STRATEGY = "sync_strategy";
    public static final String TTNET_ERROR_BODY_LENGTH_LIMIT = "ttnet_error_body_length_limit";
    public static final String TTNET_ERROR_PROTO_TYPE = "ttnet_proto_type";
    public static final String TTNET_TNC_SAVE_AB_TEST_DELAY_TIME_S = "ttnet_tnc_save_ab_test_delay_time_s";
    public static final String UNCHECK_EXTERNAL_PUBLIC_DIR = "uncheck_external_public_dir";
    public static final String USE_HOST_DNS = "use_host_dns";
    public static final String USE_NETWORK_CALLBACK = "use_network_callback";

    public interface AhPlans {
        public static final String KEY_AH_DEVICE_PLANS = "device_plans";
        public static final String KEY_AH_DEVICE_REQUIREMENTS = "device_requirements";
        public static final String KEY_AH_DEVICE_ROM = "device_rom";
        public static final String KEY_AH_PLAN_TYPE = "type";
        public static final String KEY_ALLOW_OS_API_RANGE = "allow_os_api_range";
        public static final String KEY_ALLOW_UNKNOWN_SOURCE_ON_STARTUP = "show_unknown_source_on_startup";
        public static final String KEY_DYNAMIC_MODE = "dynamic_mode";
        public static final String KEY_JUMP_INTERVAL = "jump_interval";
        public static final String KEY_JUMP_INTERVAL_BY_SEQ = "jump_interval_by_seq";
        public static final String KEY_JUMP_UNKNOWN_SOURCE_ENABLE_FOR_ALL = "enable_for_all";
        public static final String KEY_JUMP_UNKNOWN_SOURCE_TIPS = "jump_unknown_source_tips";
        public static final String KEY_JUMP_UNKNWON_SOURCE_QUERY_INTERVAL = "query_interval";
        public static final String KEY_JUMP_UNKNWON_SOURCE_WAIT_TIME_OUT = "time_out_second";
        public static final String KEY_MIN_OS_API = "min_os_api";
        public static final String KEY_SECURITY_MODE = "scy_mode";
        public static final String KEY_SHOW_TIPS = "show_tips";
        public static final String KEY_SHOW_UNKNOWN_SOURCE_DIALOG = "show_unknown_source_dialog";

        public interface DeviceRequirements {
            public static final String KEY_ALLOW_VERSION_RANGE = "allow_version_range";
            public static final String KEY_ANTI_HIJACK_PACKAGE_NAMES = "package_names";
            public static final String KEY_ANTI_HIJACK_VERSION_ALLOW = "version_allow";
            public static final String KEY_ANTI_HIJACK_VERSION_BLOCK = "version_block";
        }
    }

    public interface AntiHijackDir {
        public static final String KEY_ANTI_HIJACK_DIR_NAME = "dir_name";
        public static final String KEY_ANTI_HIJACK_INSTALL_DESC = "ins_desc";
        public static final String KEY_IGNORE_TASK_SAVE_PATH = "ignore_task_save_path";
        public static final String SAVE_LOCATION = "save_location";
    }

    public interface BugFix {
        public static final String DEFAULT = "default";
    }

    public interface CacheCleaner {
        public static final String CLEAN_GROUP = "clean_group";
        public static final String CLEAN_ID = "clean_id";
        public static final String MONITOR_SCENE_LIST = "monitor_scene_list";
        public static final String SAVE_PATH_LIST = "save_path_list";
        public static final String START_CLEAN_DELAY_TIME_S = "start_clean_delay_time_s";
        public static final String URL_PREFIX_LIST = "url_prefix_list";
    }

    public interface NetworkFailoverStrategy {
        public static final String KEY_TTNET_BACK_HOST = "ttnet_back_host";
        public static final String KEY_TTNET_BACK_HOST_COUNT_LIMIT = "ttnet_back_host_count_limit";
        public static final String KEY_TTNET_BACK_HOST_ERROR_CODE = "ttnet_back_host_error_code";
        public static final String KEY_TTNET_IP_CHANGE_COUNT_LIMIT = "ttnet_ip_change_count_limit";
        public static final String KEY_TTNET_IP_CHANGE_ERROR_CODE = "ttnet_ip_change_error_code";
        public static final String KEY_TTNET_ISOLATION_COUNT = "ttnet_isolation_count";
        public static final String KEY_TTNET_ISOLATION_ERROR_CODE = "ttnet_isolation_error_code";
        public static final String KEY_TTNET_ISOLATION_HTTP_PROTO_TYPE = "ttnet_isolation_http_proto_type";
        public static final String KEY_TTNET_TIMEOUT_CONNECT = "ttnet_timeout_connect";
        public static final String KEY_TTNET_TIMEOUT_ERROR_CODE = "ttnet_timeout_error_code";
        public static final String KEY_TTNET_TIMEOUT_IO = "ttnet_timeout_io";
    }

    public interface PCDNConfig {
        public static final String CHUNK_RETRY_COUNT = "chunk_retry_count";
        public static final String MAX_CHUNK_LENGTH = "max_chunk_length";
        public static final String PCDN_DEGRADE_BANDWIDTH_LIMIT = "pcdn_degrade_bandwidth_limit";
        public static final String PCDN_DEGRADE_SAMPLE_COUNT = "pcdn_degrade_sample_count";
        public static final String THREAD_COUNT = "thread_count";
    }

    public interface RetryScheduleConfig {
        public static final String ALLOW_ERROR_CODE = "allow_error_code";
        public static final String INTERVAL_SEC = "interval_sec";
        public static final String INTERVAL_SEC_ACCELERATION = "interval_sec_acceleration";
        public static final String MAX_COUNT = "max_count";
        public static final String USE_JOB_SCHEDULER = "use_job_scheduler";
    }

    public interface RetryStrategy {
        public static final String KEY_DELAY_INTERVAL_MS = "delay_interval_ms";
        public static final String KEY_RETRY_COUNT = "retry_count";
        public static final String KEY_RETRY_COUNT_LIMIT_PERIOD = "retry_count_limit_period";
        public static final String KEY_RETRY_PERIOD_MS = "retry_period_ms";
        public static final String KEY_RETRY_RESET_COUNT_LIMIT = "retry_reset_count_limit";
    }

    public interface SegmentConfig {
        public static final String BUFFER_COUNT = "buffer_count";
        public static final String BUFFER_SIZE = "buffer_size";
        public static final String CONNECT_TIMEOUT = "connect_timeout";
        public static final String ENABLE_TTNET_IP_REQUEST = "enable_ttnet_ip_request";
        public static final String EXPECT_MIN_DOWNLOAD_SIZE = "expect_min_download_size";
        public static final String IP_STRATEGY = "ip_strategy";
        public static final String MAIN_RATIO = "main_ratio";
        public static final String POOR_SPEED_RATIO = "poor_speed_ratio";
        public static final String RATIO_SEGMENT = "ratio_segment";
        public static final String READ_TIMEOUT = "read_timeout";
        public static final String SEGMENT_MAX_KB = "segment_max_kb";
        public static final String SEGMENT_MIN_INIT_MB = "segment_min_init_mb";
        public static final String SEGMENT_MIN_KB = "segment_min_kb";
        public static final String SEGMENT_MODE = "segment_mode";
        public static final String THREAD_COUNT = "thread_count";
        public static final String URL_BALANCE = "url_balance";
    }
}
