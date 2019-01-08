// This C++ header file was generated by the TTCN-3 compiler
// of the TTCN-3 Test Executor version CRL 113 200/6 R4C
// for U-LAYTEC\mcleish (mcleish@LT-411-0143) on Thu Jan  3 14:01:37 2019

// Copyright (c) 2000-2018 Ericsson Telecom AB

// Do not edit this file unless you know what you are doing.

#ifndef HTTP__Test__no__ASPs_HH
#define HTTP__Test__no__ASPs_HH

#ifdef TITAN_RUNTIME_2
#error Generated code does not match with used runtime.\
 Code was generated without -R option but -DTITAN_RUNTIME_2 was used.
#endif

/* Header file includes */

#include <TTCN3.hh>
#include "HTTPmsg_PortType.hh"

#if TTCN3_VERSION != 60402
#error Version mismatch detected.\
 Please check the version of the TTCN-3 compiler and the base library.\
 Run make clean and rebuild the project if the version of the compiler changed recently.
#endif

#ifndef WIN32
#error This file should be compiled on WIN32
#endif

#undef HTTP__Test__no__ASPs_HH
#endif

namespace HTTP__Test__no__ASPs {

/* Forward declarations of classes */

typedef PreGenRecordOf::PREGEN__RECORD__OF__CHARSTRING CHARSTRINGS;
typedef PreGenRecordOf::PREGEN__RECORD__OF__CHARSTRING_template CHARSTRINGS_template;
typedef PreGenRecordOf::PREGEN__RECORD__OF__OCTETSTRING OCTETSTRINGS;
typedef PreGenRecordOf::PREGEN__RECORD__OF__OCTETSTRING_template OCTETSTRINGS_template;
class ptcList;
class ptcList_template;

} /* end of namespace */

#ifndef HTTP__Test__no__ASPs_HH
#define HTTP__Test__no__ASPs_HH

namespace HTTP__Test__no__ASPs {

/* Type definitions */

typedef COMPONENT MTC;
typedef COMPONENT_template MTC_template;
typedef COMPONENT HTTP__client;
typedef COMPONENT_template HTTP__client_template;
typedef COMPONENT HTTP__server;
typedef COMPONENT_template HTTP__server_template;

/* Class definitions */

class ptcList : public Base_Type {
struct recordof_setof_struct {
int ref_count;
int n_elements;
COMPONENT **value_elements;
} *val_ptr;

static const COMPONENT UNBOUND_ELEM;
private:
friend boolean operator==(null_type null_value, const ptcList& other_value);

public:
  typedef COMPONENT of_type;
ptcList();
ptcList(null_type other_value);
ptcList(const ptcList& other_value);
~ptcList();

void clean_up();
ptcList& operator=(null_type other_value);
ptcList& operator=(const ptcList& other_value);

boolean operator==(null_type other_value) const;
boolean operator==(const ptcList& other_value) const;
inline boolean operator!=(null_type other_value) const { return !(*this == other_value); }
inline boolean operator!=(const ptcList& other_value) const { return !(*this == other_value); }

COMPONENT& operator[](int index_value);
COMPONENT& operator[](const INTEGER& index_value);
const COMPONENT& operator[](int index_value) const;
const COMPONENT& operator[](const INTEGER& index_value) const;

ptcList operator<<=(int rotate_count) const;
ptcList operator<<=(const INTEGER& rotate_count) const;
ptcList operator>>=(int rotate_count) const;
ptcList operator>>=(const INTEGER& rotate_count) const;

ptcList operator+(const ptcList& other_value) const;

ptcList substr(int index, int returncount) const;

ptcList replace(int index, int len, const ptcList& repl) const;

ptcList replace(int index, int len, const ptcList_template& repl) const;

void set_size(int new_size);
inline boolean is_bound() const {return val_ptr != NULL; }
inline boolean is_present() const { return is_bound(); }
boolean is_value() const;
int size_of() const;
int n_elem() const { return size_of(); }
int lengthof() const;
void log() const;
void set_param(Module_Param& param);
  void set_implicit_omit();
void encode_text(Text_Buf& text_buf) const;
void decode_text(Text_Buf& text_buf);
};

class ptcList_template : public Record_Of_Template {
union {
struct {
int n_elements;
COMPONENT_template **value_elements;
} single_value;
struct {
unsigned int n_values;
ptcList_template *list_value;
} value_list;
};
void copy_value(const ptcList& other_value);
void copy_template(const ptcList_template& other_value);
static boolean match_function_specific(const Base_Type *value_ptr, int value_index, const Restricted_Length_Template *template_ptr, int template_index, boolean legacy);

public:
ptcList_template();
ptcList_template(template_sel other_value);
ptcList_template(null_type other_value);
ptcList_template(const ptcList& other_value);
ptcList_template(const OPTIONAL<ptcList>& other_value);
ptcList_template(const ptcList_template& other_value);
~ptcList_template();

void clean_up();
ptcList_template& operator=(template_sel other_value);
ptcList_template& operator=(null_type other_value);
ptcList_template& operator=(const ptcList& other_value);
ptcList_template& operator=(const OPTIONAL<ptcList>& other_value);
ptcList_template& operator=(const ptcList_template& other_value);

COMPONENT_template& operator[](int index_value);
COMPONENT_template& operator[](const INTEGER& index_value);
const COMPONENT_template& operator[](int index_value) const;
const COMPONENT_template& operator[](const INTEGER& index_value) const;

void set_size(int new_size);
int n_elem() const;
int size_of(boolean is_size) const;
inline int size_of() const { return size_of(TRUE); }
inline int lengthof() const { return size_of(FALSE); }
boolean match(const ptcList& other_value, boolean legacy = FALSE) const;
inline boolean is_bound() const 
  {return template_selection != UNINITIALIZED_TEMPLATE; }
boolean is_value() const;
ptcList valueof() const;
ptcList substr(int index, int returncount) const;

ptcList replace(int index, int len, const ptcList_template& repl) const;

ptcList replace(int index, int len, const ptcList& repl) const;

void set_type(template_sel template_type, unsigned int list_length);
ptcList_template& list_item(unsigned int list_index);
void log() const;
void log_match(const ptcList& match_value, boolean legacy = FALSE) const;
void encode_text(Text_Buf& text_buf) const;
void decode_text(Text_Buf& text_buf);
boolean is_present(boolean legacy = FALSE) const;
boolean match_omit(boolean legacy = FALSE) const;
void set_param(Module_Param& param);
void check_restriction(template_res t_res, const char* t_name=NULL, boolean legacy = FALSE) const;
boolean get_istemplate_kind(const char* type) const;
};


/* Function prototypes */

extern boolean operator==(null_type null_value, const ptcList& other_value);
inline boolean operator!=(null_type null_value, const ptcList& other_value) { return !(null_value == other_value); }
extern void TC();
extern void start_TC(const COMPONENT& component_reference);
extern void server__TC();
extern void start_server__TC(const COMPONENT& component_reference);
extern void f__singleEncDecCheck(const HTTPmsg__Types::HTTPMessage& p__msg);
extern void f__EncDec();
extern void start_f__EncDec(const COMPONENT& component_reference);
extern void f__EncDec2();
extern void start_f__EncDec2(const COMPONENT& component_reference);
extern void singleTC();
extern void start_singleTC(const COMPONENT& component_reference);
extern verdicttype testcase_parallel__TC__client(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__parallel__server(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__stress(const INTEGER& n, boolean has_timer, double timer_value);
extern verdicttype testcase_tc__stress__Persistent__both(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__server(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__client(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__http__encDec(boolean has_timer, double timer_value);
extern verdicttype testcase_tc__http__encDec2(boolean has_timer, double timer_value);

/* Global variable declarations */

extern const CHARSTRING& HttpServerHostName;
extern const INTEGER& HttpServerPort;
extern const BOOLEAN& HTTPClientUseSSL;
extern const INTEGER& HttpServerListenPort;
extern const BOOLEAN& HttpServerUseSSL;
extern const TTCN_Typedescriptor_t& MTC_descr_;
extern const TTCN_Typedescriptor_t& HTTP__client_descr_;
extern HTTPmsg__PortType::HTTPmsg__PT HTTP__client_component_HTTP__client__port;
extern const TTCN_Typedescriptor_t& HTTP__server_descr_;
extern HTTPmsg__PortType::HTTPmsg__PT HTTP__server_component_HTTP__server__port;
extern const TTCN_Typedescriptor_t CHARSTRINGS_descr_;
extern const XERdescriptor_t CHARSTRINGS_0_xer_;
extern const TTCN_Typedescriptor_t CHARSTRINGS_0_descr_;
extern const TTCN_Typedescriptor_t OCTETSTRINGS_descr_;
extern const XERdescriptor_t OCTETSTRINGS_0_xer_;
extern const TTCN_OERdescriptor_t OCTETSTRINGS_0_oer_;
extern const TTCN_Typedescriptor_t OCTETSTRINGS_0_descr_;
extern const TTCN_Typedescriptor_t ptcList_descr_;
extern const HTTPmsg__Types::Half__close_template& h;
extern const HTTPmsg__Types::HTTPMessage_template& recv__resp;
extern const HTTPmsg__Types::HTTPMessage_template& recv__req;
extern const HTTPmsg__Types::HTTPMessage_template& recv__err;
extern TTCN_Module module_object;

} /* end of namespace */

#endif
